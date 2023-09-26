package exito.app.tasks;

import exito.app.userinterfaces.AgregarProductoCarritoUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProductoCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(AgregarProductoCarritoUI.BTN_CATEGORIAS, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(AgregarProductoCarritoUI.BTN_CATEGORIAS),
                WaitUntil.the(AgregarProductoCarritoUI.BTN_ENTREGA, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(AgregarProductoCarritoUI.BTN_ENTREGA),
                Click.on(AgregarProductoCarritoUI.BTN_CIUDAD),
                WaitUntil.the(AgregarProductoCarritoUI.SLT_CIUDAD, isClickable()).forNoMoreThan(30).seconds()
        );

        actor.attemptsTo(
                Click.on(AgregarProductoCarritoUI.SLT_CIUDAD),
                Click.on(AgregarProductoCarritoUI.BTN_NOMBRE_ALMACEN),
                WaitUntil.the(AgregarProductoCarritoUI.SLT_NOMBRE_ALMACEN, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(AgregarProductoCarritoUI.SLT_NOMBRE_ALMACEN),
                WaitUntil.the(AgregarProductoCarritoUI.BTN_CONTINUAR, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(AgregarProductoCarritoUI.BTN_CONTINUAR)
        );

        
        if (AgregarProductoCarritoUI.LBL_POPUP.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    WaitUntil.the(AgregarProductoCarritoUI.LBL_POPUP, isNotCurrentlyVisible()).forNoMoreThan(5).seconds()
            );
        }

        actor.attemptsTo(
                WaitUntil.the(AgregarProductoCarritoUI.BTN_CONTINUAR_COMPRA, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(AgregarProductoCarritoUI.BTN_CONTINUAR_COMPRA),
                WaitUntil.the(AgregarProductoCarritoUI.BTN_MODA, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(AgregarProductoCarritoUI.BTN_MODA),
                WaitUntil.the(AgregarProductoCarritoUI.BTN_MARROQUINERIA, isClickable()).forNoMoreThan(20).seconds()
        );

        actor.attemptsTo(
                Click.on(AgregarProductoCarritoUI.BTN_MARROQUINERIA),
                WaitUntil.the(AgregarProductoCarritoUI.BTN_AGREGAR, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(AgregarProductoCarritoUI.BTN_AGREGAR)
        );
        actor.remember("ProductoAgregado",AgregarProductoCarritoUI.LBL_PRODUCTO.resolveFor(actor).getText());
        actor.attemptsTo(
                WaitUntil.the(AgregarProductoCarritoUI.BTN_CARRITO_COMPRAS, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(AgregarProductoCarritoUI.BTN_CARRITO_COMPRAS)
        );
    }

    public static Performable agegar () {
        return Instrumented.instanceOf(AgregarProductoCarrito.class).withProperties();
    }
}
