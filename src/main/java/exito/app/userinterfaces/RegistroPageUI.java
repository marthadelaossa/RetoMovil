package exito.app.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroPageUI {
    public static final Target BTN_REGISTRARSE= Target.the("Boton registrarse").locatedBy("//*[@id='AppCompatButton_registrarse']");
    public static final Target INPUT_NOMBRE = Target.the("Input Nombres").locatedBy("(//*[@class='android.widget.EditText'])[1]");
    public static final Target INPUT_APELLIDO = Target.the("Input Apellidos").locatedBy("(//*[@class='android.widget.EditText'])[2]");
    public static final Target INPUT_NUMERO_DOCUMENTO = Target.the("Input Numero de documento").locatedBy("(//*[@class='android.widget.EditText'])[3]");
    public static final Target BTN_ANHO = Target.the("Boton Lista año").locatedBy("(//*[@id='text_input_end_icon'])[2]");
    public static final Target SLT_ANHO = Target.the("Selecion Año").locatedBy("//*[@text='1997']");
    public static final Target BTN_MES = Target.the("Boton Lista mes").locatedBy("(//*[@id='text_input_end_icon'])[3]");
    public static final Target SLT_MES = Target.the("Seleccion Mes").locatedBy("//*[@text='09']");
    public static final Target BTN_DIA = Target.the("Boton Lista dia").locatedBy("(//*[@id='text_input_end_icon'])[4]");
    public static final Target SLT_DIA = Target.the("Seleccion Dia").locatedBy("//*[@text='01']");
    public static final Target INPUT_CELULAR = Target.the("Input Celular").locatedBy("//*[@id='TextInputEditText_tel']");
    public static final Target INPUT_CORREO = Target.the("Input Correo").locatedBy("(//*[@class='android.widget.EditText'])[5]");
    public static final Target BTN_CONFIRMAR = Target.the("Boton Crear").locatedBy("//*[@id='AppCompatButton_registrar']");
    public static final Target LBL_CONFIRMAR = Target.the("Texto de confirmacion").locatedBy("//*[@id='AppCompatTextView_bienvenido']");
}
