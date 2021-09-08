import org.junit.Test;

public class MainClassTest extends MainClass {
//    @Test
//    public void testGetLocalNumber() {
//        int a = this.getLocalNumber();
//        if (a == 14) {
//            System.out.println("Method returns: " + a);
//        } else {
//            System.out.println("Method returns wrong data");
//        }
//
//    }

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
