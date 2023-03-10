public class Course {
    String grade;
    double numGrade;
    String courseName;
    double courseCredit;
    double totalPoint;

    public Course(String name) {
        courseName = name;
    }
    public void setCredit(double credit){
        courseCredit = credit;
    }
    public double getCredit(){
        return courseCredit;
    }

    public void setGrade(String letterGrade) {
        this.grade = letterGrade;
    }

    public String getGrade() {
        return grade;
    }
    private double convertGrade(){
        switch (grade) {
            case "A1" -> {
                numGrade = 4.00;
            }
            case "A2" -> {
                numGrade = 3.75;
            }
            case "A3" -> {
                numGrade = 3.50;
            }
            case "B1" -> {
                numGrade = 3.25;
            }
            case "B2" -> {
                this.numGrade = 3.00;
            }
            case "B3" -> {
                this.numGrade = 2.75;
            }
            case "C1" -> {
                this.numGrade = 2.50;
            }
            case "C2" -> {
                this.numGrade = 2.25;
            }
            case "C3" -> {
                this.numGrade = 2.00;
            }
            case "D" -> {
                this.numGrade = 1.75;
            }
            default -> {
                System.out.println("I believe grade has a typo u silly goose.");
            }
        }
        return numGrade;
    }
    private double findScore(){
        convertGrade();
        this.totalPoint = numGrade * courseCredit;
        return totalPoint;
    }
}