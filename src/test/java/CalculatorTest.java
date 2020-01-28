import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
        public void before(){calculator = new Calculator();};

    @Test
    public void canAdd(){assertEquals(2, calculator.add(1,1));};

    @Test
    public void canSubtract() {assertEquals(3, calculator.subtract(4,1));
    }

    @Test
    public void canMultiply() {assertEquals(4, calculator.multiply(2,2));
    }

//    @Test
//    public void canDivide() {assertEquals(2.00,calculator.divide(10.00,5.00));
//    }
}
