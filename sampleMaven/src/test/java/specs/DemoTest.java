package specs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		int a=20;
		int b=10;
		Assert.assertEquals(a+b, 30);
	}
	@Test
	public void sub() {
		int a=30;
		int b=10;
		Assert.assertEquals(a-b, 20);
	}
	@Test
	public void mul() {
		int a=20;
		int b=10;
		Assert.assertEquals(a*b, 200);
	}
	@Test
	public void div() {
		int a=20;
		int b=10;
		Assert.assertEquals(a/b, 2);
	}
	

}
