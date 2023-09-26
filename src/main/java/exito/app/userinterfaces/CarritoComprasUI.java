package exito.app.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class CarritoComprasUI {

    public static final Target INPUT_CUPON = Target.the("Cupon Descuento").locatedBy("//*[@class='android.widget.EditText']");

    public static final Target LBL_PRODUCTO = Target.the("Producto en el Carrito de Compras").locatedBy("((//*[@id='render-store.custom.checkout-io']/*[@class='android.view.View'])[1]/*[@class='android.widget.TextView'])[2]");

}
