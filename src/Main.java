public class Main {
    public static void main(String[] args) {
        // instantiate two Person objects
        Person person1 = new Person("James Peterson", 34, 180, 73.5);
        Person person2 = new Person("Bob Thornley", 25, 171, 68.2);

        // print person 1 details
        System.out.println("Person 1 Details: ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Height: " + person1.getHeight());
        System.out.println("Weight: " + person1.getWeight());

        // print person 2 details
        System.out.println("\nPerson 2 Details: ");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Height: " + person2.getHeight());
        System.out.println("Weight: " + person2.getWeight());
    }
}