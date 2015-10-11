package Test2;

/**
 * Created by IT_School on 11.10.2015.
 */
public class PassObjRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);

        int x = 10; int y = 10;
        ob.meth(x,y);
        System.out.println("x & y before call : " + x + " " + y);
        System.out.println("ob.a & ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a & ob.b after call: " + ob.a + " " + ob.b);
    }
}
