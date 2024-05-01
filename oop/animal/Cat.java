public class Cat extends Animal{

    private int color;
    private int eyeColor;

    public Cat() {
        super("Meome","Small",3);
    }

    public Cat(String type, double weight, int color, int eyeColor ){
        super(type, "small", weight);
        this.color = color;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color=" + color +
                ", eyeColor=" + eyeColor +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println(type + " moves " + speed);
    }
}
