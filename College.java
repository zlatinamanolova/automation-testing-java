public class College extends StudentGroup {
    public static void main(String[] args) {


        StudentGroup empty = new StudentGroup();
        empty.emptyGroup();
        StudentGroup group = new StudentGroup("Math");

        Student student1 = new Student("Zlatko", "Math");
        student1.grade = 5.5;

        Student student2 = new Student("Sashko", "Math");
        student2.grade = 6.5;

        Student student3 = new Student("Bob", "Math");
        student3.grade = 7.0;

        Student student4 = new Student("Todorka", "Math");
        student4.grade = 7.3;

        Student student5 = new Student("Moli", "Math");
        student5.grade = 5.5;

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);

        System.out.println("The best student is: " + group.theBestStudent());

        StudentGroup group2 = new StudentGroup("QA'S");

        Student student22 = new Student("Milen", "QA'S");
        student1.grade = 9.5;

        Student student23 = new Student("Silvia", "QA'S");
        student2.grade = 3.5;

        Student student24 = new Student("Jojo", "QA'S");
        student3.grade = 2.0;

        Student student25 = new Student("Zlatina", "QA'S");
        student4.grade = 50.0;

        Student student26 = new Student("Zlatin", "QA'S");
        student5.grade = 0.5;

        group2.addStudent(student22);
        group2.addStudent(student23);
        group2.addStudent(student24);
        group2.addStudent(student25);
        group2.addStudent(student26);

        group2.printStudentsInGroup();
    }
}
