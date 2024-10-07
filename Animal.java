abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canSwim();
    public abstract boolean canWalk();
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}


