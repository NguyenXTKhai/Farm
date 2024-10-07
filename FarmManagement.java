 public class FarmManagement {
        public static void main(String[] args) {
            Farm farm = new Farm();

            Animal a1 = new Pig("Pig");
            Animal a2 = new Duck("Duck");
            Animal a3 = new Fish("Fish");

            farm.addAnimal(a1);
            farm.addAnimal(a2);
            farm.addAnimal(a3);

            for(Animal a: farm.getAnimals()) {
                if(a instanceof Pig) {
                    System.out.println(a.getName() + " can walk but can't swim");
                }
                if(a instanceof Duck) {
                    System.out.println(a.getName() + " can walk and swim");
                }
                if(a instanceof Fish) {
                    System.out.println(a.getName() + " can swim but can't walk");
                }
            }
        }
}

