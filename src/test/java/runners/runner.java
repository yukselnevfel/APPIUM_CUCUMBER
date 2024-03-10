package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = {"src/test/resources/features","src/test/resources/apiFeatures"},
        glue = "stepdefinitions",
        tags = "@abu",
        dryRun =false
        /* Eger dry run degerimiz true ise bu adim bize features bulanan tag ait olan kisimdaki eksik adimlari yani tanimlanmayan
      adimlari bize soyler. Eger adimlar tanimlanmissa tekrar calistirildigin testimiz passed olur ama bu adimlarda eksik adim olmadigini
      gosterir yani aslinda testimizin passed oldugunu gostermez!

      Eger false olursa artik eksik adimlarin tamamlanmasinin ardindan tanimlanan adimlar testler uzerinde kosturlamaya baslar.
       */
)
public class runner {
    //Projemizin BEYNİDİR!!!
}
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/yukselnevfel/APPIUM_CUCUMBER.git
git push -u origin main