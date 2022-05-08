package Animal;

public class Animals_Inheritance {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];

        animal[0] = new Mammal("Filbert", 3, 7, "Cat");
        animal[1] = new Dog("Albert", 4, 10, "Carnivora", "Bulldog");
        animal[2] = new Bird("Bubba", 1, 1, "Blue");
        animal[3] = new Pigeon("Zazu", 5, 3, "Green", "Brazil");
        animal[4] = new Fish("Dori", 7, 4, "Blue/Yellow");
        animal[5] = new BlowFish("Sashimi", 6, 1, "Orange", 12);

        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0] = new Dog("Albert", 4, 10, "Carnivora", "Bulldog");
        animalBehavior[1] = new Pigeon("Zazu", 5, 3, "Green", "Brazil");
        animalBehavior[2] = new BlowFish("Sashimi", 6, 1, "Orange", 12);


        for (Animal x : animal) {
            AnimalName.name(x.getName());


        }
    }
}
