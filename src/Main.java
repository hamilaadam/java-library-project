import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {

        //exercise1

//        CampusCard myCard= new CampusCard("Adam", 100);
//        System.out.println(myCard.cardId);
//        System.out.println(myCard.getBalance());
//        Scanner in=new Scanner(System.in);
//        System.out.println("select the amount to deposit");
//        double x= in.nextDouble();
//        myCard.topUp(x);
//        System.out.println(myCard.getBalance());
//        System.out.println("select the amount to pay");
//        double y= in.nextDouble();
//        myCard.pay(y);
//        myCard.printCardStatus();
//        myCard.setBalance(100);
//        System.out.println(myCard.balance);

        //exercise 2

//        Scanner in=new Scanner(System.in);
//        System.out.println("enter coursecode");
//        String cc= in.nextLine();
//        System.out.println("enter coursename");
//        String cn= in.nextLine();
//        System.out.println("enter ects");
//        int ects= in.nextInt();
//        CourseRecord myrecord= new CourseRecord(cc,cn,ects);
//        System.out.println(myrecord.getCourseRecord());
//        System.out.println(myrecord.getCourseRecord());
//        myrecord.printSummary();
//        System.out.println("now enter grade");
//        double gr= in.nextDouble();
//        myrecord.setGrade(gr);
//        System.out.println("---------------");
//        System.out.println(myrecord.getCourseRecord());
//        System.out.println(myrecord.getCourseRecord());
//        System.out.println(myrecord.getGradePoints());
//        myrecord.printSummary();

        //execisse 3


        SemesterPlan winterTerm = new SemesterPlan("Winter 2026");
// 1. Create two CourseRecord objects:
// - "INHN0006", "Software Engineering" with 6 ECTS and grade 1.3
// - "INHN0004", "Discrete Structures" with 8 ECTS and grade 4.7
        CourseRecord se = new CourseRecord("INHN0006", "Software Engineering", 6, 1.3);
        CourseRecord ds = new CourseRecord("INHN0004", "Discrete Structures", 8, 4.7);
        CourseRecord ds2 = new CourseRecord("INHN0004", "Discrete Structures", 8, 4.7);
        winterTerm.addRecord(se);
        winterTerm.addRecord(ds);
        winterTerm.addRecord(ds2);
// 2. Calculate remaining credits needed to achieve standard 30 ects

        int registeredEcts = winterTerm.getTotalEcts();
        int ectsRemaining = 30 - registeredEcts;
// 3. Obtain weighted average for passed modules
        double gpa = winterTerm.calculateWeightedAverage();
        System.out.println("Registered ECTS: " + registeredEcts + " Remaining to 30: " + ectsRemaining + ")");
        System.out.println("Weighted GPA (for Passed courses): " + gpa);


    }
}