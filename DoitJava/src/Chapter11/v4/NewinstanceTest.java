package Chapter11.v4;

public class NewinstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("Chapter11.v4.Person");
        Person person2 = (Person)pClass.newInstance();
        System.out.println(person2);
    }
}
