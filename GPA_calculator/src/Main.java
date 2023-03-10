import org.w3c.dom.ls.LSInput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Course[] courses;
        Scanner scan = new Scanner(System.in);
        System.out.println("name of the course: ");
        String course = scan.next();
        public void addCourse(Course course) {
            for (int i = 0; i < courses.length; i++) {
                if (courses[i] == null) {
                    courses[i] = course;
                    break;
                }
            }
        }
    }
}