package tests.us0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.Driver;

public class Tc_003 {

    //3) Kriter seçiminden sonra gelen otel seçenekleri tiklanabilir olmali.

    @Test
    public void test() {
        QAConcortPage qaConcortPage = new QAConcortPage();
        qaConcortPage.ConcortHotelRoomsGiris();
        qaConcortPage.ConcortHotelRoomsBilgiGiris();
        Assert.assertTrue(qaConcortPage.bookNowUs010.isEnabled(), "Otel secenekleri tiklanabilir degil!");
        Driver.closeDriver();
    }
}
