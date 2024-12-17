import com.groupeisi.Calculatrice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatriceTest {

    @Test
    public void CalculatriceFactTest() {
        Calculatrice calculatrice = new Calculatrice();
        int terme1 = 5;
        int resultatAttendu = 120;
        int resultatObtenu = calculatrice.CalculatriceFact(terme1);
        assertEquals(resultatAttendu, resultatObtenu);
    }
}
