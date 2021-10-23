import com.torryharris.test.Calculator;
import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(6,calculator.add(5,1));
    }
    @Test
    public void subTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(2,calculator.sub(4,2));

    }
    @Test
    public void mulTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(12,calculator.mul(4,3));

    }
    @Test
    public void divTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(2,calculator.div(4,2));

    }
}
