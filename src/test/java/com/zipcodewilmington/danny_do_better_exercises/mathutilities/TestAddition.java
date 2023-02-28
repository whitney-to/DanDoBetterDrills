package com.zipcodewilmington.danny_do_better_exercises.mathutilities;

import com.zipcodewilmington.danny_do_better_exercises.MathUtilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 8/26/18.
 */
public class TestAddition {
    private static volatile MathUtilities mathUtils = new MathUtilities();

    @Test
    public void testIntegerAddition() {
        // : Given
        int baseValue = 20;
        int addedValue = 7;
        int expected = 27;
        // : When
        int actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testLongAddition() {
        // : Given
        long baseValue = 228437266;
        long difference = 228437265;
        long expected = 456874531;
        // : When
        long actual = mathUtils.add(baseValue, difference);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testShortAddition() {
        // : Given
        short baseValue = 16384;
        short addedValue = 7;
        short expected = 16391;
        // : When
        short actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testByteAddition() {
        // : Given
        byte baseValue = 63;
        byte addedValue = 64;
        byte expected = 127;
        // : When
        byte actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testFloatAddition() {
        // : Given
        float baseValue = 750.585F;
        float addedValue = 795.000F;
        float expected = 1545.585F;
        // : When
        float actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testDoubleAddition() {
        // : Given
        double baseValue = 225.25;
        double addedValue = 231;
        double expected = 456.25;
        // : When
        double actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual, 0);
    }
}
