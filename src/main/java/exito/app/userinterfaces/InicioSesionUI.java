package exito.app.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionUI {

    public static final Target BTN_INGRESAR = Target.the("Boton ingresar").locatedBy("//*[@id='AppCompatButton_ingresar']");
    public static final Target INPUT_CORREO = Target.the("Correo").locatedBy("//*[@id='TextInputEditText_email']");
    public static final Target INPUT_CLAVE = Target.the("Clave").locatedBy("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.LinearLayout']]");
    public static final Target LBL_INICIO = Target.the("Mensaje bienvenida").locatedBy("//*[@text='¿Cómo quieres recibir tu pedido?']");
}
