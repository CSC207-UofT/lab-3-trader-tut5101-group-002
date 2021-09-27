import org.junit.*;

import static org.junit.Assert.*;

public class HuskyTest {
    Husky h = new Husky();


    @Test
    public void testGetName() {
        assertEquals("Noname", h.getName());
    }

    @Test
    public void testSound() {
        assertEquals("Wow", h.sound());
    }

}