package Animal;

public class Dog extends Mammal implements AnimalBehavior,AnimalMove{
    private String breed;

    Dog(){
        super();
        breed = "NN";
    }

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }
    public void attitude(){
        System.out.println("The dog is running.");
    }

    @Override
    public void drinkWater(){
        System.out.println("The dog is drinking water.");
    }

    @Override
    public void getVoice() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The dog is eating" + food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString()
    {
        return "Dog{"+"breed='"+breed+'\''+'}';
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleep 12 hours a day.");
    }

    @Override
    public void move(){
        System.out.println("Dogs run.");
    }
}