package Organisation;


import org.testng.annotations.Test;

public class CheckingTest {

	@Test
	public void display() {
		System.out.println("CheckingTest");
		String name=System.getProperty("key");
		System.out.println(name);
	}
}
