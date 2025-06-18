package OOPs;

public class Student {

    // attributes
    String name;
    int student_id;
    public int age;
    EntranceExam exam;

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
        this.exam = new EntranceExam(12,"Java Module Test");
    }

    // copy constructor
    Student(Student s){
        name = s.name;
        age = s.age;
        student_id = s.student_id;
       // exam = s.exam;  // shallow copy
       // exam = new EntranceExam(s.exam.examId,s.exam.examName); // deep copy via reference variable
          exam = new EntranceExam(s.exam); // this will call copy constructor of EntranceExam (deep copy via constructor)
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
