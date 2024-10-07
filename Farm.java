import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void getAnimalCanSwim() {
        System.out.println("Animal can swim: ");
        for (Animal animal : animals) {
            if (animal.canSwim()) {
                System.out.println(animal.getName());
            }
        }
    }
    public void getAnimalCanWalk() {
        System.out.println("Animal can walk: ");
        for (Animal animal : animals) {
            if (animal.canWalk()) {
                System.out.println(animal.getName());
            }
        }
    }
}
