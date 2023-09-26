package exito.app.tasks;

import exito.app.userinterfaces.InicioSesionUI;
import exito.app.utils.LeerFichero;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class InicioSesionUsuario implements Task {

    String correo;
    String clave;

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            correo= LeerFichero.linea(1);
            clave=LeerFichero.linea(2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (!InicioSesionUI.BTN_INGRESAR.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    CerrarSesionUsuario.cerrar()
            );
        }
        actor.attemptsTo(
                WaitUntil.the(InicioSesionUI.BTN_INGRESAR, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(InicioSesionUI.BTN_INGRESAR),
                WaitUntil.the(InicioSesionUI.INPUT_CORREO, isClickable()).forNoMoreThan(20).seconds()
        );

        actor.attemptsTo(
                Enter.theValue(correo).into(InicioSesionUI.INPUT_CORREO),
                Enter.theValue(clave).into(InicioSesionUI.INPUT_CLAVE),
                Click.on(InicioSesionUI.BTN_INGRESAR),
                WaitUntil.the(InicioSesionUI.LBL_INICIO, isClickable()).forNoMoreThan(20).seconds()
        );

    }

    public static Performable iniciar () {

        return Instrumented.instanceOf(InicioSesionUsuario.class).withProperties();
    }
}
