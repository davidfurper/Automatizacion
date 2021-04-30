package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage {
    @FindBy(how = How.XPATH, using = "//input[@class='gLFyf gsfi'")
    private WebElement cajaTexto;
    @FindBy(how = How.NAME, using = "btnK")
    private WebElement btnBuscar;

    public WebElement getCajaTexto() {
        return cajaTexto;
    }

    public WebElement getBtnBuscar() {
        return btnBuscar;
    }
}
