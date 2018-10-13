package testing.org.LeelaMaven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemoTest {
	
	int i=11;	
	int d=20;
	@Test
	public void demo()
	{
		Assert.assertEquals(true, i%2==0);
		System.out.println("after assertion");
	}
	
	@Test
	public void demo1()
	{
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(true, i%2==0);
		System.out.println("after assertion");
	}


}
