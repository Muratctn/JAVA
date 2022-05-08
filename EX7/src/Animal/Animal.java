package Animal;

abstract class Animal implements AnimalName{
    String name;
    int age;
    int weight;



    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal() {
        age = weight = 0;
        name = "NN";
    }

    public Animal(int age) {this.age = age;}



    public abstract void eat(String food);
    public abstract void getVoice();


    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}