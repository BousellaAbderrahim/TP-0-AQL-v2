public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public boolean isAdult() {
        return this.age >= 18;
    }
}
