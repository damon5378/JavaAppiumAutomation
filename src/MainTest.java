import org.junit.Assert;
import org.junit.Test;

public class MainTest extends CoreTestCase {
    @Test
    public void firstTest() {
        int expected = 25;
        int actual = 5 * 5;

        Assert.assertTrue("5 * 5 !=25",actual == expected);

    }
}






























//    @Test
//    public void myFirstTest() {
//        System.out.println("First test: Before changing static_int: " + MathHelper.static_int);
//        MathHelper.static_int = 8;
//        MathHelper mathObject = new MathHelper();
//        System.out.println("First test: Before changes simple_int " + mathObject.simple_int);
//        mathObject.simple_int = 8;
//        this.typeStartMessage();
//    }
//
//    @Test
//    public void mySecondTest() {
//        System.out.println("Second test: Before changing static_int: " + MathHelper.static_int);
//        MathHelper.static_int = 8;
//        MathHelper mathObject = new MathHelper();
//        System.out.println("Second test: Before changes simple_int " + mathObject.simple_int);
//        mathObject.simple_int = 8;
//        this.typeStartMessage();
//    }




