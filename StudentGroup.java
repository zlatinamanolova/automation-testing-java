public class StudentGroup extends Student {

    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup(){
        students = new Student[5];
        freePlaces = 5;
    }

    StudentGroup(String subject){
        this();
        this.groupSubject = subject;
    }

    void addStudent(Student s){
        if(s.subject.equals(groupSubject) && freePlaces > 0){
            for(int i = 0; i < students.length; i++){
                if(students[i] == null){
                    students[i] = s;
                    freePlaces--;
                    break;
                }
            }
        }
    }

    void emptyGroup(){
        this.students = new Student[0];
        freePlaces = 5;
    }

    protected String theBestStudent() {
        double bestGrade = 0;
        String bestStudent = "";
        for(int i = 0; i < students.length; i++){
            if(students[i] != null && students[i].grade > bestGrade){
                bestGrade = students[i].grade;
                bestStudent = students[i].name;
            }
        }
        return bestStudent;
    }

    protected void printStudentsInGroup(){;
        for (int i = 0; i < students.length; i++) {
            System.out.println(" Student name is " + students[i].name + " and grade is " + students[i].grade);
        }
        }
}


