package exito.app.stepsDefinitions;


import cucumber.api.java.Before;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import exito.app.drivers.AppiumAndroidDriver;
import exito.app.tasks.RegistroUsuario;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class RegistrarNuevoUsuarioStepsDefinitions {

    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra en la aplicacion movil del exito$")
    public void queElUsuarioSeEncuentraEnLaAplicacionMovilDelExito() throws IOException {
        OnStage.theActorCalled("actor").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().iniciar()));
    }
    @Cuando("^el usuario se realiza su registro$")
    public void elUsuarioSeRealizaSuRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUsuario.registrar());
    }

    @Entonces("^el usuario confirma su registro exitoso$")
    public void elUsuarioConfirmaSuRegistroExitoso() {

    }

}
