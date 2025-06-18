package OOPs;

public class Client {

    public static void main(String[] args) {


        Student s1 = new Student();
//        s1.name = "sakshi";
//        s1.age = 2;
//        s1.student_id = 1;

        Student s2 = new Student("sam",3,45);

//        System.out.println(s1);
//        System.out.println(s2);

        BankAccount account = new BankAccount("sakshi",43432);
//        account.deposit(100);
//        account.withdraw(10);
//        System.out.println(account);
//        account.printTransactionHistory();


        Student s3 = new Student("samsh",4,55);

        Student s4 = new Student(s3);
        //s3.name = "sash";

//        System.out.println(s3);
//        System.out.println(s4);

        System.out.println("Hello World");
    }
}
