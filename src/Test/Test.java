package Test;

/**
 * Created by IT_School on 11.10.2015.
 */
public class Test {
    int a, b;

    Test(int i, int j) {
        a = j;
        b = j;
    }

    boolean equals(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
