package DAY7;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class classexercise1 {
  @Test(dataProvider = "dp",priority=2)
  public void add(Integer n, Integer n1) {
	  System.out.println(n+n1);
  }
  @Test(dataProvider = "dp",priority=3)
  public void sub(Integer n, Integer n1) {
	  System.out.println(n-n1);
  }
  @Test(dataProvider = "dp",priority=1)
  public void mult(Integer n, Integer n1) {
	  System.out.println(n*n1);
  }
  @Test(dataProvider = "dp",priority=4)
  public void div(Integer n, Integer n1) {
	  System.out.println(n/n1);
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 245, -78 },
      //new Object[] { 2, 578 },
    };
  }
}
