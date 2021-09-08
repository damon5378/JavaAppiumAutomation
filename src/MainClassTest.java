import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String a = this.class_string;

        Assert.assertTrue("Hello", a.contains("Hello"));
        Assert.assertTrue("hello", a.contains("hello"));
        Assert.assertTrue("Other", a.contains("Other"));

    }

    }

