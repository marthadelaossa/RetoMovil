package exito.app.tasks;


import exito.app.userinterfaces.CarritoComprasUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CarritoComprasUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CarritoComprasUI.INPUT_CUPON, isPresent()).forNoMoreThan(20).seconds()
        );
        Ensure.that(Text.of(CarritoComprasUI.LBL_PRODUCTO).equals(actor.recall("ProductoAgregado")));
    }

    public static Performable ver() {
        return Instrumented.instanceOf(CarritoComprasUsuario.class).withProperties();
    }
}
