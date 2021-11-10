package tests.us0002;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Tc_003 {
    //3-Log in sayfasindaki password textbox'i gorunur ve deger girilebilir olmali
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        QAConcortPage qaConcortPage = new QAConcortPage();
        qaConcortPage.ilkLoginLinki.click();
        Thread.sleep(2000);
        qaConcortPage.passwordKutusu.isDisplayed();
        qaConcortPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHQAValidPassword") + Keys.ENTER);
        Driver.closeDriver();
    }
}
