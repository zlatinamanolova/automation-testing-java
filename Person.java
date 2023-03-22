class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) throws IllegalArgumentException {
        if (age < 0 || height < 0 || weight < 0) {
            throw new IllegalArgumentException("Age, height, and weight can not be negative.");
        }
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age can not be negative.");
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height < 0) {
            throw new IllegalArgumentException("Height can not be negative.");
        }
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws IllegalArgumentException {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight can not be negative.");
        }
        this.weight = weight;
    }
}