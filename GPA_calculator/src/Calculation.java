import java.util.Scanner;

public class Calculation {
    static double totalCredits = 0;
    static double totalPoints = 0;
    static boolean isCalculated = false;
    public static void doCalculation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("how many courses you take?");
        int numOfCourse = scan.nextInt();
        for (int i = 0; i < numOfCourse; i++) {
            System.out.println("name of the course: ");
            String courseName = scan.next();
            System.out.println("credit of the course: ");
            double credit = scan.nextDouble();
            totalCredits += credit;
            System.out.println("letter grade: ");
            String grade = scan.next();
            Course course = new Course(courseName, credit, grade);
            totalPoints += course.getTotalPoint();
            isCalculated = true;
        }
        System.out.println(String.format("gpa of term: %,.2f", (totalPoints / totalCredits)));

    }

}
