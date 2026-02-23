package testgenerictype;

import Entity.Student;
import java.util.ArrayList;

public class TestGenericType {

    public static void main(String[] args) {

        ArrayList<Student> sList = new ArrayList<>();

        Student s = new Student(12, "Tanvir", "tanvir@gmail.com");
        Student s1 = new Student();
        s1.setId(13);
        s1.setName("Masud");
        s1.setEmail("masud@gmail.com");

        sList.add(new Student(10, "Emon", "emon@gmail.com"));
        sList.add(new Student(11, "PK", "pk@gmail.com"));
        sList.add(s);

        System.out.println(sList);

    }

}
