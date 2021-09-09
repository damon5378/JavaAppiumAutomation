import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {

        String a = this.class_string;

        Assert.assertTrue(a.contains("Hello") || a.contains("hello"));

    }






    }

