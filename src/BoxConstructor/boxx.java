package BoxConstructor;

/**
 * Created by IT_School on 10.10.2015.
 */
public class boxx {
    double weight;
    double height;
    double depth;

    //finalize
    double volume(){
        return weight * height * depth;
    }

    protected void finalize() {
        System.out.println("Goodbye box ");
    }
}
