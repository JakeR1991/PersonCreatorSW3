public class Person {
    // properties of a person
    private String name;
    private int age;
    private double height;
    private double weight;

    // constructor method to set the initial state of the Person object's properties
    public Person(String name, int age, double height, double weight) {
        // use set methods to set the properties
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    // get method for name property
    public String getName() {
        return name;
    }

    // set method for name property
    public void setName(String name) {
        this.name = name;
    }

    // get method for age property
    public int getAge() {
        return age;
    }

    // set method for age property
    public void setAge(int age) {
        this.age = age;
    }

    // get method for height property
    public double getHeight() {
        return height;
    }

    // set method for height property
    public void setHeight(double height) {
        this.height = height;
    }

    // get method for weight property
    public double getWeight() {
        return weight;
    }

    // set method for weight property
    public void setWeight(double weight) {
        this.weight = weight;
    }
}