package pub;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwentyFivePercentTest {

  @Test
  public void discount() {
    HappyHourStrategy twentyFivePercent = new TwentyFivePercent();
    Assert.assertEquals(twentyFivePercent.calculateNewPrice(new Beer("Pale Ale", 4.0)), 3.0);
  }

}
