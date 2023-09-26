package exito.app.tasks;

import exito.app.userinterfaces.CerrarSesionUI;
import exito.app.userinterfaces.InicioSesionUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CerrarSesionUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CerrarSesionUI.BTN_MI_CUENTA, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CerrarSesionUI.BTN_MI_CUENTA),
                WaitUntil.the(CerrarSesionUI.BTN_CERRAR_SESION, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CerrarSesionUI.BTN_CERRAR_SESION)
        );

        actor.attemptsTo(
                WaitUntil.the(CerrarSesionUI.BTN_ACEPTAR, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CerrarSesionUI.BTN_ACEPTAR),
                WaitUntil.the(InicioSesionUI.BTN_INGRESAR, isClickable()).forNoMoreThan(20).seconds()
        );
    }

    public static Performable cerrar() {
        return Instrumented.instanceOf(CerrarSesionUsuario.class).withProperties();
    }
}
