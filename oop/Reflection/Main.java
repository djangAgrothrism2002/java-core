
import java.lang.reflect.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> personClass = Class.forName("Person");

            // Tạo một đối tượng Person với tên và tuổi đã biết
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            Object person = constructor.newInstance("John", 30);

            // Gọi phương thức displayInfo() của đối tượng Person
            Method method = personClass.getMethod("displayInfo");
            method.invoke(person);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
