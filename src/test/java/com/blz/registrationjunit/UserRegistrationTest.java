package com.blz.registrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	Regex validator = new Regex();

	// Test cases to validate First Name.
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.firstName("priya");
		Assert.assertTrue(result);
	}

	// Test cases to Short FIrst Name.
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.firstName("pri");
		Assert.assertEquals(false, result);
	}

	// Test cases to Special char First Name.
	@Test
	public void givenFirstName_WhenSpChar_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.firstName("priya");
		Assert.assertEquals(false, result);
	}

	// Test cases to validate Last Name.
	@Test
	public void LastName_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.lastName("Bijapur");
		Assert.assertEquals(true, result);
	}

	// Test cases to Sort Last Name.
	@Test
	public void LastName_WhenShort_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.lastName("Bijapur");
		Assert.assertEquals(false, result);
	}

	// Test cases to validate Email Name.
	@Test
	public void Email_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.Email("abc@bl.co");
		Assert.assertEquals(true, result);
	}

	@Test
	public void Email_WhenInValid_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.Email(".xyz@bl.");
		Assert.assertEquals(false, result);
	}

	// Test cases to validate Contact Number.
	@Test
	public void contactNumber_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.contactNumber("91 1234567890");
		Assert.assertEquals(true, result);
	}

	@Test
	public void contactNumber_WhenShort_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.contactNumber("91 123456790");
		Assert.assertEquals(false, result);
	}

	@Test
	public void password1_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.password1("abcdfghjk");
		Assert.assertEquals(true, result);
	}

	@Test
	public void password1_WhenPassShort_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.password1("abcd");
		Assert.assertEquals(false, result);
	}

	@Test
	public void password2_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.password2("Abcdfhyup");
		Assert.assertEquals(true, result);
	}

	@Test
	public void password2_WhenNoUpCase_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.password2("abcdfhyup");
		Assert.assertEquals(false, result);
	}

	@Test
	public void password3_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.password3("Abccda123");
		Assert.assertEquals(true, result);
	}

	@Test
	public void password3_WhenNoNumeric_ShouldReturnFlase() {
		Regex valid = new Regex();
		boolean result = valid.password3("abcdfhgjkd");
		Assert.assertEquals(false, result);
	}

	@Test
	public void password4_WhenValid_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.password4("abcDfh12$");
		Assert.assertEquals(true, result);
	}

	@Test
	public void password4_WhenNoSpCHar_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.password4("abcDfh123");
		Assert.assertEquals(false, result);
	}

	@Test
	public void Email_WhenValidated_ShouldReturnTrue() {
		Regex valid = new Regex();
		boolean result = valid.EmailValidation("abc@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void Email_WhenNotValidated_ShouldReturnFalse() {
		Regex valid = new Regex();
		boolean result = valid.EmailValidation("abc@.com.my");
		Assert.assertEquals(false, result);
	}

}
