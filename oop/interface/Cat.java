
public class Cat extends Animal {
    @Override
    public String Bark() {
        return "Meo meo";
    }

    public static void main(String[] args) {
        Animal animal2 = new Cat();
        System.out.println(animal2.Bark());

    }
}
