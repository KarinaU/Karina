package Test4;

/**
 * Created by IT_School on 11.10.2015.
 */
public class Access_Test {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 100; // Error

        ob.setC(100);

        System.out.println("a,b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
