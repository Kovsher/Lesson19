import java.io.Serializable;
import java.lang.reflect.Field;

public class Person implements Serializable {
    private String FirstName;
    private String LastName;
    private int age;
    transient private boolean isStudent;
    private String newField;
    private static final long seralVersionUID = 36127826347812634L;

    private static String gender = "male";



    public Person(String firstName, String lastName, int age, boolean isStudent) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.isStudent = isStudent;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                ", newField='" + newField + '\'' +
                '}';
    }
}

