package day6;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class classexercise2 {
  @Test (priority=1)
  public void add() {
	  int a=30;
	  int b=20;
	  int res=0;
	  res=a+b;
	  System.out.print("add");
	  AssertJUnit.assertEquals(res,50);
  }
  
  @Test (priority=3)
  public void sub() {
	  int a=55;
	  int b=45;
	  int res=0;
	  res=a-b;
	  System.out.print("subtraction");
	  AssertJUnit.assertEquals(res,10);
  }
  
  @Test (priority=2)
  public void multiplication() {
	  int a=10;
	  int b=20;
	  int res=1;
	  res=a*b;
	  System.out.print("multiplication");
	  AssertJUnit.assertEquals(res,200);
 
  }
  
  @Test (priority=4)
  public void division() {
	  int a=100;
	  int b=10;
	  int res;
	  res=a/b;
	  System.out.print("division");
	  AssertJUnit.assertEquals(res,10);
  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
