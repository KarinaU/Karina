package Test3;

/**
 * Created by IT_School on 11.10.2015.
 */
public class Test3 {
    int a;

     Test3(int i) {
        a = i;
    }

    Test3 incrByTen(){
        Test3 temp = new Test3(a+10);
        return temp;
    }
}
