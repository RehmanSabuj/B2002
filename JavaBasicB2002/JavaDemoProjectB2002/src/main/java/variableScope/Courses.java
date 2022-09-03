package variableScope;

import javaPractice.ConstructorObjects;

public class Courses {
    public static void main(String[] args) {
       Courses courses = new Courses();
        courses.qaeStudents();
    }

        public void qaeStudents() {
            Students students = new Students();
            String student1 = students.student1;
            System.out.println(student1);
            String student2 = Students.student2;
            System.out.println(student2);
        }

    }
