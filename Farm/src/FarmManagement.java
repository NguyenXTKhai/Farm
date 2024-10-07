 public class FarmManagement {
        public static void main(String[] args) {

            Farm farm = new Farm();

            farm.addAnimal(new Pig("Pig"));
            farm.addAnimal(new Duck("Duck"));
            farm.addAnimal(new Fish("Fish"));

            farm.getAnimalCanSwim();
            farm.getAnimalCanWalk();
        }
}

