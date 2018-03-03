package pub;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NoDiscountTest {

  @Test
  public void discount() {
    HappyHourStrategy noDiscount = new NoDiscount();
    Assert.assertEquals(noDiscount.calculateNewPrice(new Beer("Chouffe", 4.0)), 4.0);
  }

}
