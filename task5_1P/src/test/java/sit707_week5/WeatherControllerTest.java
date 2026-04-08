package sit707_week5;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class WeatherControllerTest {
	
	private static WeatherController wController;
	private static List<Double> temperatures;

	@BeforeClass
    public static void setUp() {
        System.out.println("=== Setup ===");

        wController = WeatherController.getInstance();
        temperatures = new ArrayList<>();

        int nHours = wController.getTotalHours();

        for (int i = 0; i < nHours; i++) {
            temperatures.add(wController.getTemperatureForHour(i + 1));
        }
    }

	@AfterClass
    public static void close() {
        System.out.println("=== close ===");

        wController.close();
    }

    @Test
    public void testStudentIdentity() {
        String studentId = "s225191589";
        Assert.assertNotNull(studentId);
    }
	
    @Test
    public void testStudentName() {
        String studentName = "Owen Zheng";
        Assert.assertNotNull(studentName);
    }

    @Test
    public void testTemperatureMin() {
        System.out.println("+++ testTemperatureMin +++");

        double min = 1000;
        for (double t : temperatures) {
            if (min > t) {
                min = t;
            }
        }

        Assert.assertEquals(min, wController.getTemperatureMinFromCache(), 0.001);
    }
    
    @Test
    public void testTemperatureMax() {
        System.out.println("+++ testTemperatureMax +++");

        double max = -1;
        for (double t : temperatures) {
            if (max < t) {
                max = t;
            }
        }

        Assert.assertEquals(max, wController.getTemperatureMaxFromCache(), 0.001);
    }

    @Test
    public void testTemperatureAverage() {
        System.out.println("+++ testTemperatureAverage +++");

        double sum = 0;
        for (double t : temperatures) {
            sum += t;
        }
        double avg = sum / temperatures.size();

        Assert.assertEquals(avg, wController.getTemperatureAverageFromCache(), 0.001);
    }
	
	@Test
	public void testTemperaturePersist() {
		/*
		 * Remove below comments ONLY for 5.3C task.
		 */
//		System.out.println("+++ testTemperaturePersist +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		String persistTime = wController.persistTemperature(10, 19.5);
//		String now = new SimpleDateFormat("H:m:s").format(new Date());
//		System.out.println("Persist time: " + persistTime + ", now: " + now);
//		
//		Assert.assertTrue(persistTime.equals(now));
//		
//		wController.close();
	}
}
