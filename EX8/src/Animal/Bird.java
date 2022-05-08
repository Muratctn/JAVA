package Animal;

public class Bird extends Animal implements AnimalMove,AnimalName {
    String featherColor;

    public Bird() {
        super();
        featherColor = "NN";
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(int age, String featherColor) {
        super(age);
        this.featherColor = featherColor;
    }

    public void drinkWater() {
        System.out.println("Siup siup");
    }

    @Override
    public void eat(String food) {
        System.out.println("Bird is eating: " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Bird is making this sound: ");
    }
}