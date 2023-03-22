import java.time.Year;
import java.util.Set;

public class Student extends Person {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;


     Student(){
         super();
         this.grade = 4.0;
        this.yearInCollege = 3;
        this.isDegree = true;
        this.money = 0;
    }

     Student(String name, String subject){
        this();
        this.name = name;
        this.subject = subject;
    }

    public void upYear() {

        if(isDegree) {
            System.out.println("Student has already graduated, cannot increase year.");
        } else {
            if(yearInCollege + 1 == 4) {
                yearInCollege++;
                this.isDegree = true;
            } else {
                yearInCollege++;
            }
        }
    }


}
