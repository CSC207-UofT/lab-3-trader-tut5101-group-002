/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("~~~~~~~~.", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(31415926, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(62831852, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(15707963, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000000000, d.getPrice());
    }

}