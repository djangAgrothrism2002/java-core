package oop.polimorphirsm;

public class Animal {

    public String type;
    public String size;
    public double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal() {

    }

    public String Bark() {
        return "Animal";
    }

}
