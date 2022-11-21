package practice_program;


import org.testng.annotations.Test;

public class CreateCustomerTest {
	@Test()
	public void createCustomer()
	{
		int[] arr= {1,2};
		System.out.println(arr[1]);
		//System.out.println("customer is created successfully");
	}
	@Test(enabled = false)
	public void updateCustomer()
	{
		System.out.println("customer account is updated");
	}
	@Test(priority = -1)
	public void deleteCustomer()
	{
		System.out.println("customer account is deleted");
	}

}
