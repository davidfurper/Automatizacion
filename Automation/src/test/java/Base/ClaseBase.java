package Base;

import definitions.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.TestPage;

public class ClaseBase {
    public static TestPage testPage;

    public static void initPage(){
        testPage = PageFactory.initElements(Hooks.getDriver(), TestPage.class);
    }

}
