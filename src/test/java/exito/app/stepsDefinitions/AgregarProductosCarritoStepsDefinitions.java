package exito.app.stepsDefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import exito.app.tasks.AgregarProductoCarrito;
import exito.app.tasks.CarritoComprasUsuario;
import exito.app.tasks.InicioSesionUsuario;
import exito.app.tasks.RegistroUsuario;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class AgregarProductosCarritoStepsDefinitions {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesionUsuario.iniciar());
    }

    @Cuando("realiza la busqueda de un producto agregando al carrito de compras")
    public void realizaLaBusquedaDeUnProductoAgregandoAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductoCarrito.agegar());
    }

    @Entonces("el usuario podra ver su producto agregadao en el carrito")
    public void elUsuarioPodraVerSuProductoAgregadaoEnElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(CarritoComprasUsuario.ver());
    }

}
