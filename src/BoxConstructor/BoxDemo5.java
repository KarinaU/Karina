package BoxConstructor;

/**
 * Created by IT_School on 10.10.2015.
 */
public class BoxDemo5 {

    public static void main(String[] args) {
        boxx mybox1 = new boxx();
        boxx mybox2 = new boxx();
        double vol;

        mybox1.weight = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.weight = 3;
        mybox2.depth = 6;
        mybox2.height = 9;


        vol = mybox1.volume();
        System.out.println( "Volume is ");

        vol = mybox2.volume();
        System.out.println( "Volume is ");
    }
}
