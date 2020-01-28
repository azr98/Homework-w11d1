import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    private Waterbottle waterbottle;

    @Before
        public void before(){waterbottle = new Waterbottle(100);};

    @Test
        public void canDrink(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());};

    @Test
        public void canEmpty(){
        waterbottle.empty();
        assertEquals(0,waterbottle.getVolume());
    };

    @Test
    public void canFill(){
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100,waterbottle.getVolume());
    }


}
