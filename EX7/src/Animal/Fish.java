package Animal;


public class Fish extends Animal implements AnimalMove{
    public String scaleColor;

    public Fish(){
        super();
        scaleColor = "NN";
    }
    public Fish(String name, int age, int weight,String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(int age,String scaleColor)
    {
        super(age);
        this.scaleColor = scaleColor;
    }



    @Override
    public void eat(String food) {
        System.out.println("Fish is eating: "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("Fish is making this sound: ");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString(){
        return "Fish{"+"scaleColor='"+scaleColor+'\''+'}';
    }


}