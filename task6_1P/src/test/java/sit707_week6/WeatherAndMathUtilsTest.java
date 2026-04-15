package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s225191589";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Owen Zheng";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	}
	
	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(4));
	}
	
    @Test
	public void testEvenNumber() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(10));
	}

	@Test
	public void testOddNumber() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(7));
	}

	@Test
	public void testWeatherCancelByWind() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 1.0));
	}

	@Test
	public void testWeatherCancelByRain() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(20.0, 7.0));
	}

	@Test
	public void testWeatherCancelMixed() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 5.0));
	}

	@Test
	public void testWeatherWarnWind() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.5, 1.0));
	}

	@Test
	public void testWeatherWarnRain() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(10.0, 4.5));
	}

	@Test
	public void testWeatherNormal() {
		Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(5.0, 2.0));
	}

	@Test
	public void testPrimeTrue() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
	}

	@Test
	public void testPrimeFalseEven() {
		Assert.assertFalse(WeatherAndMathUtils.isPrime(8));
	}

	@Test
	public void testPrimeSpecialCase() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}
}
