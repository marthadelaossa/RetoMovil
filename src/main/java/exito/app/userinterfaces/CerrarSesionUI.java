package exito.app.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CerrarSesionUI {

    public static final Target BTN_MI_CUENTA = Target.the("MI CUENTA").located(By.xpath("//*[@text='Mi cuenta']"));
    public static final Target BTN_CERRAR_SESION = Target.the("CERRAR SESION").located(By.xpath("//*[@text='Cerrar sesión']"));
    public static final Target BTN_ACEPTAR = Target.the("ACEPTAR").located(By.xpath("//*[@id='AppCompatTextView_confirmar']"));

}
