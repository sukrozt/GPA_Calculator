
public class Main {
    public static void main(String[] args) {
        try{
            Calculation.doCalculation();
        }
        catch (Exception NumberFormatException){
            System.out.println("number of courses should be an integer");}
    }
}

//errors will be specialized
//ui will be in a loop until its calculated
//there will be an ui