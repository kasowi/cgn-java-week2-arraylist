package exercises;

import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentDBTest {

    static Student max = new Student(3, "Max");
    static Student tom = new Student(4, "Tom");
    static Student anton = new Student(5, "Anton");

    @Test
    void remove_whenStudentId3_removeMax() {
        StudentDB studentDB = new StudentDB();
        List<Student> testlist = new ArrayList<>();
        testlist.add(tom);
        testlist.add(anton);
        studentDB.add(max);
        studentDB.add(tom);
        studentDB.add(anton);
        Assertions.assertEquals(max, studentDB.remove(3));
        studentDB.remove(3);
       // Assertions.assertEquals(testlist, studentDB.getAllStudents());


    }
}
