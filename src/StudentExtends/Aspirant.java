package StudentExtends;

/**
 * Created by IT_School on 11.10.2015.
 */
public class Aspirant extends Student{
    private String work;

    public Aspirant(String Name, int age, String work) {
        super(Name, age);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString() + "Aspirant{" +
                "work='" + work + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Ivanov Ivan", 22);
        System.out.println(student.toString());

        Aspirant aspirant = new Aspirant("Cidorov Cidor", 28, "Issledovatel baz danix");
        System.out.println(aspirant);
    }
}
