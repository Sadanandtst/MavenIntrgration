package MavenDemoinMay.MavenDemoinMay;




import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest2 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void sum()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest2 :: Sum");
		Assert.assertEquals(30 , a+b);
	}
	
	@Test
	public void sub()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest2 :: Sub");
		Assert.assertEquals(10 , b-a);
	}
	
	@Test
	public void div()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest2 :: Div");
		Assert.assertEquals(2 , b/a);
	}
	
	@Test
	public void mult()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest2 :: Mult");
		Assert.assertEquals(200 , a*b);
	}
	
}
