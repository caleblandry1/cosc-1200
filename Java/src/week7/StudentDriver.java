package week7;

public class StudentDriver {

    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("Student one Details");
        student1.displayStudent();

        student1.setName("Bruce Wayne");
        student1.displayStudent();

        System.out.println("-------------");
        System.out.println("student two Details");
        Student student2 = new Student("Bruce", 0L, 8.0);
        student2.displayStudent();
    }
}
