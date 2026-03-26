package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
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
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
	    date.increment();
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
	    date.decrement();
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	@Test
	public void testJuly31ShouldIncrementToAugust1() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testJuly1ShouldDecrementToJune30() {
	    DateUtil date = new DateUtil(1, 7, 2024);
	    date.decrement();
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

}
