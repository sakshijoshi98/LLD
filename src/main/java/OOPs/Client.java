package OOPs;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Student s1 = new Student();
//        s1.name = "sakshi";
//        s1.age = 2;
//        s1.student_id = 1;

        Student s2 = new Student("sam",3,45);

//        System.out.println(s1);
//        System.out.println(s2);

        BankAccount account = new BankAccount("sakshi",43432);
        account.deposit(100);
        account.withdraw(10);
        System.out.println(account);
        account.printTransactionHistory();
    }
}
