package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "s225191589";
		Assert.assertNotNull("Student ID is s225191589", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Owen Zheng";
		Assert.assertNotNull("Student name is Owen Zheng", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("Test Empty Username & Empty Password → " + status);
    }
	
	/*
	 * Write more test functions below.
	 */
	@Test
	public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, "xyz");
		Assert.assertFalse(status.isLoginSuccess());
		System.out.println("Test Empty Username & Wrong Password → " + status);
	}
	
	@Test
	public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, "ahsan_pass");
		Assert.assertFalse(status.isLoginSuccess());
		System.out.println("Test Empty Username & Correct Password → " + status);
	}
	
	@Test
	public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("abc", null);
		Assert.assertFalse(status.isLoginSuccess());
		System.out.println("Test Wrong Username & Empty Password → " + status);
	}
	
	@Test
	public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("abc", "xyz");
		Assert.assertFalse(status.isLoginSuccess());
		System.out.println("Test Wrong Username & Wrong Password → " + status);
	}
	
	@Test
	public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("abc", "ahsan_pass");
		Assert.assertFalse(status.isLoginSuccess());
		System.out.println("Test Wrong Username & Correct Password → " + status);
	}
	
	@Test
	public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("ahsan", null);
		Assert.assertFalse(status.isLoginSuccess());
		System.out.println("Test Correct Username & Empty Password → " + status);
	}
	
	@Test
	public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("ahsan", "xyz");
		Assert.assertFalse(status.isLoginSuccess());
		System.out.println("Test Correct Username & Wrong Password → " + status);
	}
	
	@Test
	public void testSuccessLoginButEmptyValidationCodeShouldFail() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertFalse(LoginForm.validateCode(null));
		System.out.println("Test Correct Login → " + status);
	}
	
	@Test
	public void testSuccessLoginButWrongValidationCodeShouldFail() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertFalse(LoginForm.validateCode("abcd"));
		System.out.println("Validation Wrong Code → " + LoginForm.validateCode("abcd"));
	}
	
	@Test
	public void testSuccessLoginAndCorrectValidationCodeShouldPass() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess());
		Assert.assertTrue(LoginForm.validateCode("123456"));
		System.out.println("Validation Correct Code → " + LoginForm.validateCode("123456"));
	}
}
