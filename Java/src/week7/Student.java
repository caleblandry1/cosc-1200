package week7;

public class Student {

    //data members
    private String name;
    private Long id;
    private Double grade;


    //Default Constructor
    public Student() {
        this.name = "";
        this.id = 0L;
        this.grade = 0.0;
    }

    //non default constructor
    public Student(String name, Long id, Double grade) {
        this.name = name;
        this.id = 0L;
        this.grade = grade;
    }

    //setters
    public void setId(Long id) {}
    public void setGrade(Double grade) {}
    public void setName(String name) {}

    //getters
    public Long getId() { return this.id; }
    public Double getGrade() { return this.grade; }
    public String getName() { return this.name; }

    public String toString(){
        return "student { id: " + this.id + "\n name: " + this.name + "\n grade: " + this.grade + " }";
    }

    public void displayStudent() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Grade: " + this.grade);
    }

}
