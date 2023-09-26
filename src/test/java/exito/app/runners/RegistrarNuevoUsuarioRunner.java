package exito.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrarNuevoUsuario.feature",
        glue = "exito.app.stepsDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RegistrarNuevoUsuarioRunner {
}
