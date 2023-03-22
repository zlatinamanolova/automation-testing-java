public class Demo {
    public static void main(String[] args) {
        try {
            Person person = new Person("Zlatina", 25, 1.78, 65.0);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Height: " + person.getHeight());
            System.out.println("Weight: " + person.getWeight());

            // Here if I set height and weight setters the exception is still only for the first setAge and I can not understand why
            // Also the setName is not used, because it's a string. I am not checking String for negative values

            person.setAge(-27);
            person.setHeight(-1.80);
            person.setWeight(-70);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}