package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopUtilsTest {

    @Test
    public void testSumUpToNormal() {
        Assert.assertEquals(15, LoopUtils.sumUpTo(5));
    }

    @Test
    public void testSumUpToZero() {
        Assert.assertEquals(0, LoopUtils.sumUpTo(0));
    }

    @Test
    public void testSumUpToOne() {
        Assert.assertEquals(1, LoopUtils.sumUpTo(1));
    }

    @Test
    public void testCountEvenNumbersNormal() {
        Assert.assertEquals(3, LoopUtils.countEvenNumbers(6));
    }

    @Test
    public void testCountEvenNumbersOddLimit() {
        Assert.assertEquals(2, LoopUtils.countEvenNumbers(5));
    }

    @Test
    public void testCountEvenNumbersZero() {
        Assert.assertEquals(0, LoopUtils.countEvenNumbers(0));
    }
}