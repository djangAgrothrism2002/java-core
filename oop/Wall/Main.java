package oop.Wall;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        wall.setHeight(-15);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
    }
}
