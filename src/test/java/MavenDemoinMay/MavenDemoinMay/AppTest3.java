package MavenDemoinMay.MavenDemoinMay;




import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest3 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void sum()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest3 :: Sum");
		Assert.assertEquals(30 , a+b);
	}
	
	@Test
	public void sub()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest3 :: Sub");
		Assert.assertEquals(10 , b-a);
	}
	
	@Test
	public void div()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest3 :: Div");
		Assert.assertEquals(2 , b/a);
	}
	
	@Test
	public void mult()
	{
		int a = 10;
		int b = 20;
		System.out.println("Apptest3 :: Mult");
		Assert.assertEquals(200 , a*b);
	}
	
}
