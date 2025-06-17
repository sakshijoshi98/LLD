package OOPs;

public class Student {

    // attributes
    String name;
    int student_id;
    public int age;

    //custom constructor
    Student(){
        name = "sakshi";
        age = 2;
        student_id = 1;
    }

    // parametrized constructor
    public Student(String name, int student_id,int age){
        this.name = name;
        this.student_id = student_id;
        this.age = age;
    }


    //behaviours
    void submitAssignment(int assignment_id){
        System.out.println("Student submitted" + assignment_id);
    }

    void attendingClass(int class_id){
        System.out.println("Class attends" + class_id);
    }

    public void setStudentId(int student_id){
        this.student_id = student_id;
    }

    public int getStudentId(){
        return student_id;
    }
}
