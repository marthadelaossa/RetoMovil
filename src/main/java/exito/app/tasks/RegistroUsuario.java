package exito.app.tasks;

import exito.app.drivers.AppiumAndroidDriver;
import exito.app.userinterfaces.RegistroPageUI;
import exito.app.utils.Datos;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class RegistroUsuario implements Task {

    TouchAction check = new TouchAction(AppiumAndroidDriver.driver);
    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {


         actor.attemptsTo(
                WaitUntil.the(RegistroPageUI.BTN_REGISTRARSE, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(RegistroPageUI.BTN_REGISTRARSE)
        );

        actor.attemptsTo(
                WaitUntil.the(RegistroPageUI.INPUT_NOMBRE, isEnabled()).forNoMoreThan(40).seconds(),
                Enter.theValue(datos.getNombre()).into(RegistroPageUI.INPUT_NOMBRE),
                Enter.theValue(datos.getApellido()).into(RegistroPageUI.INPUT_APELLIDO),
                Enter.theValue(datos.getNumeroDocumento()).into(RegistroPageUI.INPUT_NUMERO_DOCUMENTO),
                Click.on(RegistroPageUI.BTN_ANHO)
        );
        actor.attemptsTo(
                Click.on(RegistroPageUI.SLT_ANHO),
                Click.on(RegistroPageUI.BTN_MES),
                Click.on(RegistroPageUI.SLT_MES),
                Click.on(RegistroPageUI.BTN_DIA),
                Click.on(RegistroPageUI.SLT_DIA)
        );
        actor.attemptsTo(
                Enter.theValue("3002568954").into(RegistroPageUI.INPUT_CELULAR),
                Enter.theValue(datos.getCorreo()).into(RegistroPageUI.INPUT_CORREO)

        );
        check.tap(PointOption.point(88, 1607)).perform();
        check.tap(PointOption.point(88, 1739)).perform();
        actor.attemptsTo(
                Click.on(RegistroPageUI.BTN_CONFIRMAR),
                WaitUntil.the(RegistroPageUI.LBL_CONFIRMAR, isVisible()).forNoMoreThan(30).seconds()

                );
    }

    public static Performable registrar() {
        return Instrumented.instanceOf(RegistroUsuario.class).withProperties();
    }
}
