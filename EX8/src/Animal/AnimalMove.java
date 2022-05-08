package Animal;

public interface AnimalMove {
    default void move(){
        System.out.println("Animals move.");
    }
}