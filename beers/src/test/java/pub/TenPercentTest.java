package pub;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TenPercentTest {

  @Test
  public void discount() {
    HappyHourStrategy tenPercent = new TenPercent();
    Assert.assertEquals(tenPercent.calculateNewPrice(new Beer("IPA", 5.0)), 4.5);
  }

}
