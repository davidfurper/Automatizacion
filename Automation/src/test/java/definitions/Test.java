package definitions;

import Base.ClaseBase;
import browserManager.DriverManager;
import browserManager.DriverManagerFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;


public class Test {

    @Given("^se ingresa a \"([^\"]*)\"$")
    public void se_ingresa_a(String url) throws Throwable {
        Hooks.getDriver().navigate().to(url);
    }

    @Given("^se valida que exista el cuadro de texto para hacer busqueda$")
    public void se_valida_que_exista_el_cuadro_de_texto_para_hacer_busqueda() throws Throwable {
        ClaseBase.testPage.getCajaTexto().isDisplayed();
    }

    @Given("^se ingresa el \"([^\"]*)\"$")
    public void se_ingresa_el(String texto) throws Throwable {
        ClaseBase.testPage.getCajaTexto().sendKeys(texto);
    }

    @Given("^se buscar$")
    public void se_buscar() throws Throwable {
        Thread.sleep(3000);
        ClaseBase.testPage.getBtnBuscar().click();
    }
}
