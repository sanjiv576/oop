package unitTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyTest {

    // loosely coupled
    Arithmetic arithmetic ;


    // this runs at first
    @Before
    public void init(){
        arithmetic = new Arithmetic(2,4);
    }

    // then this runs
    @Test
    public void testAddition(){
        // the value that we expects
        int expectedResult = 6;

        // the value that comes from code
        int actualResult = arithmetic.add();

        // checking whether expected and actual results meet or not in color
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testMulti(){
        int expectedResult = 8;
        int actualResult = arithmetic.mul();
        Assert.assertEquals(expectedResult, actualResult);

    }

    // this runs at last, which removes from memory
    @After
    public void destroy(){
        arithmetic = null;
    }
}
