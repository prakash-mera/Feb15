package JenkinsJobFeb15.HelloJenkins;

import org.junit.*;

public class SampleDemo {

	@Before
	public void login() {
		System.out.println("From Login");
	}

	@Test
	public void addToCart() {
		System.out.println("From ");
	}

	@After
	public void logout() {
		System.out.println();
	}

}
