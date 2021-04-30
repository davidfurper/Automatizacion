package runners;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@testFuncional",
        features = "src/test/java/features",
        glue = "definitions",
        plugin = "json:test/report/cucumber_report.json")
public class TestRunner {
    @AfterClass
    public static void finish(){
        try{
            System.out.println("Generando reporte");
            String[] cmd = {"cmd.exe","/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado");

        }catch (Exception ex) {
        ex.printStackTrace();
        }
    }
}
