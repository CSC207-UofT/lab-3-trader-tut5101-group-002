/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class RaptorTest {
    Raptor r;

    @Before
    public void setUp() throws Exception {
        r = new Raptor();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        r.upgradeSpeed();
        assertEquals(101, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        r.downgradeSpeed();
        assertEquals(1, r.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000000000, r.getPrice());
    }

    @Test(timeout = 50)
    public void TestIncreasePrice() {
        r.increasePrice();
        assertEquals(1010000000, r.getPrice());
    }

}