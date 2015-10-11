package Factorial;

/**
 * Created by IT_School on 11.10.2015.
 */
public class Factorial {
    int fact(int n){
        int result;

        if(n==1)return 1;
        result = fact(n-1) * n;
        return result;
    }
}
