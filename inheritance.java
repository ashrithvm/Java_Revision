class Animal{
    private final String name;
    private double weight;

    public Animal(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return "Animal [name = "+name+", weight = "+weight+"]";
    }

    public String getName(){
        return name;
    }

    public void greet(Animal a){
        System.out.println(name+" greets "+a.getName()+"!");
    }
}

class Rabbit extends Animal{
    private final String furColor;

    public Rabbit(double weight, String furColor){
        super("Rabbit", weight);
        this.furColor = furColor;
    }

    public void move(){
        System.out.println(furColor+" "+super.getName()+" goes hop, hop, hop!");
    }
}


public class inheritance {
    public static void main(String[] args){
        Rabbit r = new Rabbit(2.5, "brown");
        Animal a = new Rabbit(3, "white");

        a.greet(r);
    }
}
