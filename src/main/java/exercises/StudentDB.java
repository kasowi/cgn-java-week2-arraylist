package exercises;

import model.Student;

import java.util.Arrays;
giimport java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDB {
    private List<Student> students = new ArrayList<>();

    public StudentDB() {
    }

     public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public Student getRandomStudent() {

        double randomDouble = Math.random();
        return students.get((int) (randomDouble * students.size()));
    }


    public void add(Student newStudent) {
        students.add(newStudent);
    }

    public Student remove(int id) {
        Student student = null;
        Student studentsbuffer;
        for (int i = 0; i < students.size(); i++) {
            studentsbuffer = students.get(i);
            if (studentsbuffer.getId() == id) {
               student = studentsbuffer;
                students.remove(studentsbuffer);
            }

    }
        return student;
    }


}