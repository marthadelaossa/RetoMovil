package exito.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarProductoCarritoUI {

    public static final Target BTN_CATEGORIAS = Target.the("Categorias").locatedBy("//*[@text='Categorías']");
    public static final Target BTN_ENTREGA = Target.the("Compra y recoge").locatedBy("//*[@id='constraitLayout_buy_and_collect']");
    public static final Target BTN_CIUDAD = Target.the("Ciudad").locatedBy("//*[@id='filled_exposed_dropdown_city']");
    public static final Target SLT_CIUDAD = Target.the("Ciudad").locatedBy("//*[@class='android.view.ViewGroup' and ./*[@text='Barranquilla']]");
    public static final Target BTN_NOMBRE_ALMACEN = Target.the("Nombre almacen").locatedBy("//*[@id='filled_exposed_dropdown_store']");
    public static final Target SLT_NOMBRE_ALMACEN = Target.the("Almacen").locatedBy("//*[@class='android.view.ViewGroup' and ./*[@text='Exito Barranquilla']]");
    public static final Target BTN_CONTINUAR = Target.the("Continuar").locatedBy("//*[@id='appCompatButton_continue']");
    public static final Target LBL_PEDIDO = Target.the("Como Quieres recibir tu Pedido").locatedBy("//*[@text='¿Cómo quieres recibir tu pedido?']");
    public static final Target BTN_MODA = Target.the("Moda, maletas y accesorios").locatedBy("//*[@text='Moda, maletas y accesorios']");
    public static final Target BTN_CONTINUAR_COMPRA = Target.the("Continuar").locatedBy("//*[@text='Continuar']");
    public static final Target LBL_POPUP = Target.the("PopUp").locatedBy("//*[@text='Tu dirección y tus productos han sido actualizados']");

    //*[@text='Tu dirección y tus productos han sido actualizados']
    public static final Target BTN_MARROQUINERIA = Target.the("Marroquinería").locatedBy("//*[@text='Marroquinería']");
    public static final Target BTN_AGREGAR = Target.the("Agregar Primer producto").locatedBy("(//*[@id='appCompatTextView_add_item'])[1]");
    public static final Target LBL_PRODUCTO = Target.the("Nombre Primer Producto").locatedBy("(//*[@id='appCompatTextView_product_title'])[1]");
    public static final Target BTN_CARRITO_COMPRAS = Target.the("Carrito de Compras").locatedBy("//*[@id='appCompatImageView_shopping_cart']");
}
