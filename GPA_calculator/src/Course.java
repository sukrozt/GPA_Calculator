public class Course {
    private String grade;
    private double numGrade;
    private String courseName;
    private double courseCredit;
    private double totalPoint;

    public Course(String name, double credit, String grade ) {
        this.courseName = name;
        setCredit(credit);
        setGrade(grade);
    }
    public void setCredit(double credit){
        this.courseCredit = credit;
    }

    public void setGrade(String letterGrade) {
        this.grade = letterGrade;
    }

    public double getTotalPoint() {
        findScore();
        return totalPoint;
    }
    private void convertGrade(){
        switch (grade) {
            case "A1" :
                numGrade = 4.00;
                break;
            case "A2" :
                numGrade = 3.75;
                break;
            case "A3" :
                numGrade = 3.50;
                break;
            case "B1" :
                numGrade = 3.25;
                break;
            case "B2" :
                numGrade = 3.00;
                break;
            case "B3" :
                numGrade = 2.75;
                break;
            case "C1" :
                numGrade = 2.50;
                break;
            case "C2" :
                numGrade = 2.25;
                break;
            case "C3" :
                numGrade = 2.00;
                break;
            case "D" :
                numGrade = 1.75;
                break;
            default :
                System.out.println("I believe there is a typo u silly goose.");
        }
    }
    private double findScore(){
        convertGrade();
        this.totalPoint = numGrade * courseCredit;
        return totalPoint;
    }
}
