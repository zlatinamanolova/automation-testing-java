public class StudentDemo extends Student{
    public static void main(String[] args) {
        Student zlatina = new Student();
        Student milen = new Student("Milen", "qa");

        System.out.println("isDegree before: " + zlatina.isDegree + ". Years in college " + zlatina.yearInCollege);
        zlatina.upYear();
        System.out.println("isDegree after: " + zlatina.isDegree + ". Years in college " + zlatina.yearInCollege);

        System.out.println("Is he having a degree? " + milen.isDegree + ". He spend " + milen.yearInCollege + "years in college" );
        milen.upYear();
        System.out.println("After double check we see the information is " + milen.isDegree + ". So his years in college are " + milen.yearInCollege);

            }

            // Не мога да се сетя тук как да увиличавам годините на студента, ама го видях в домашното и няма да чийтвам, ще знам за следващия път,
            // тук си го оставям недобавено, да видиш, че не съм се сетила сама


}
