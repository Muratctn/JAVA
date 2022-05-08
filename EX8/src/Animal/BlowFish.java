package Animal;

public class BlowFish extends Fish implements AnimalBehavior,AnimalMove{
    private int diameter;

    BlowFish(){
        super();
        diameter = 0;
    }

    public BlowFish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }
    public void attitude(){
        System.out.println("The fish is swimming.");
    }



    @Override
    public void getVoice() {
        System.out.println("The fish is popping.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The fish is eating" + food);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString()
    {
        return "Dog{"+"diameter='"+diameter+'\''+'}';
    }

    @Override
    public void sleep() {
        System.out.println("Animals sleep 8 hours of a day.");
    }

    @Override
    public void move(){
        System.out.println("Blowfish's swim");
    }
}