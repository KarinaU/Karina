package Girl;

/**
 * Created by IT_School on 11.10.2015.
 */
public class Girl {
    private String fullName;
    private int age;

    public Girl (String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toEat (String restoran){
        if(restoran.equals("Macdonalds"))
            return ("No");
        else return "Lets go";
    }
    
    

    @Override
    public String toString() {
        return "Girl" +
                "Name='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }




}
