package Test2;

/**
 * Created by IT_School on 11.10.2015.
 */
public class Test2 {
    int a,b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test2 o){
        o.a *= 2;
        o.b /= 2;
    }

    void meth(int a, int b){
        a *= 2;
        b /= 2;
    }
}