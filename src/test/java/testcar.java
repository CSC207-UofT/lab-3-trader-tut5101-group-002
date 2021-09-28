import org.junit.*;

import static org.junit.Assert.*;

public class testcar{
    car a;

    @Before
    public void setUp() throws Exception{
        a = new car("why", 10, 100);
    }

    @Test(timeout = 50)
    public void TestgetPrice(){assertEquals(207, a.getPrice());}

    @Test(timeout = 50)
    public void TestupgradeSpeed(){
        a.upgradeSpeed();
        assertEquals(11, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestdowngradeSpeed(){
        a.downgradeSpeed();
        assertEquals(0, a.getMaxSpeed());
    }
}