import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();
        if (a == 14) {
            System.out.println("Method returns: " + a);
        } else {
            System.out.println("Method returns wrong data");
        }

    }
}
