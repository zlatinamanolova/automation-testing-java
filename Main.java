public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        Person p1 = new Person("Zlatina", 30, true);
        Person p2 = new Person("Zlatin", 20, true);
        Student p3 = new Student("Ivan", 20, true, 50);
        Employee p4 = new Employee("Silvia", 40, false, 60);
        Student p5 = new Student("Milen", 18, true, 20);
        Employee p6 = new Employee("Alex", 35, false, 80);


        people[0] = p1;
        people[1] = p2;
        people[2] = p3;
        people[3] = p4;
        people[4] = p5;
        people[5] = p6;

        for (Person person : people) {
            if (person != null) {
                if (person instanceof Student) {
                    ((Student) person).showStudentInfo();
                } else if (person instanceof Employee) {
                    ((Employee) person).showEmployeeInfo();
                } else {
                    person.showPersonInfo();
                }
            }
        }


        for (Person person: people){
            if (person !=null){
                if (person instanceof Employee){
                    double overtime = ((Employee) person).calculateOvertime(2);
                    System.out.println("The sum for Employee working 2 hours overtime is " + overtime);
                }

            }
        }
    }
}