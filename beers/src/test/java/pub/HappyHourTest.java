package pub;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HappyHourTest {

  @Test
  public void orders() {

    System.out.println("=== pattern strategy ===");

    /* initialize strategy */
    HappyHourStrategy noDiscount = new NoDiscount();
    HappyHourStrategy tenPercent = new TenPercent();
    HappyHourStrategy twentyFivePercent = new TwentyFivePercent();

    /* initialize Beers */
    Beer chouffe = new Beer("Chouffe", 3.0);
    Beer paleAle = new Beer("Pale Ale", 4.0);
    Beer ipa = new Beer("IPA", 5.0);


    /* waiter */
    PubWaiter bob = new PubWaiter("Bob");

    /* orders */
    bob.setStrategy(noDiscount);
    double paleAlePrice = bob.calculatePrice(paleAle);

    bob.setStrategy(tenPercent);
    double chouffePrice = bob.calculatePrice(chouffe);

    bob.setStrategy(twentyFivePercent);
    double ipaPrice = bob.calculatePrice(ipa);

    Assert.assertEquals(paleAlePrice, 4.0);
    Assert.assertEquals(chouffePrice, 2.7);
    Assert.assertEquals(ipaPrice, 3.75);

  }
}
