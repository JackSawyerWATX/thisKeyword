public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(42, "John");
        Person person2 = new Person(35, "Henry");
        person1.objectMethods(person2);
    }
}
