package exito.app.tasks;

import exito.app.userinterfaces.RegistroPageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidacionRegistroUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(RegistroPageUI.LBL_CONFIRMAR, isVisible()).forNoMoreThan(30).seconds()
                );
    }

    public static Performable validar() {
        return Instrumented.instanceOf(ValidacionRegistroUsuario.class).withProperties();
    }
}
