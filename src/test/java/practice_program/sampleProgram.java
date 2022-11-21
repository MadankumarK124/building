package practice_program;

import org.testng.annotations.Test;

public class sampleProgram {
	@Test(invocationCount = -1)

	public void login() {
		System.out.println("login");

	}

	@Test()
	public void user() {
		System.out.println("user");
	}

	@Test(priority = -1)
	public void logot() {
		System.out.println("logout");
	}

}
