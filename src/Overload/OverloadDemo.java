package Overload;

/**
 * Created by IT_School on 10.10.2015.
 */
public class OverloadDemo {
    void test(){
        System.out.println("No parameters");
    }

    void test (int a){
        System.out.println("a: " + a);
    }

    void test (int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    double test (double a){
        System.out.println("double a: " + a);
    return a*a;
    }

}
