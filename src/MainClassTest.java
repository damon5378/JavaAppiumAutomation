import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        int a = this.getClassNumber();
        if (a <= 45) {
            System.out.println("Good");
        } else if (a >= 45) {
            System.out.println("Not good");
        } else {
           System.out.println("Your number from other Universe");
        }

    }






    }

