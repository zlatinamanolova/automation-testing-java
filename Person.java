public class Person {
    String name;
    int age;
    boolean isMan;
    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo(){
        System.out.println("The person's name is " + name);
        System.out.println("It's " + age + " year's old");
        System.out.println("This person is a " + isMan);

    }
}

