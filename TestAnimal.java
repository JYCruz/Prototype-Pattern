interface Animal extends Cloneable {
    Animal clone();
    void makeSound();
    String getType();
}

class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }
    public Sheep(Sheep other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
        this.name = other.name;
    }

    @Override
    public Sheep clone() {
        return new Sheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Cow(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }
  
    public Cow(Cow other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
        this.name = other.name;
    }

    @Override
    public Cow clone() {
        return new Cow(this);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Horse(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }
  
    public Horse(Horse other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
        this.name = other.name;
    }

    @Override
    public Horse clone() {
        return new Horse(this);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Default Sheep");
        cowPrototype = new Cow(4, "Moo", "Grass", "Default Cow");
        horsePrototype = new Horse(4, "Neigh", "Hay", "Default Horse");
    }

    public Animal createSheep(String name) {
        Sheep newSheep = (Sheep) sheepPrototype.clone();
        newSheep.setName(name);
        return newSheep;
    }

    public Animal createCow(String name) {
        Cow newCow = (Cow) cowPrototype.clone();
        newCow.setName(name);
        return newCow;
    }

    public Animal createHorse(String name) {
        Horse newHorse = (Horse) horsePrototype.clone();
        newHorse.setName(name);
        return newHorse;
    }
}

// TESTING HEREEE
public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Dolly");
        Animal sheep2 = registry.createSheep("Sheepy");
        Animal cow1 = registry.createCow("Betsy");
        Animal horse1 = registry.createHorse("Spirit");

        System.out.println(sheep1.getType() + ": " + ((Sheep) sheep1).getName());
        sheep1.makeSound();

        System.out.println(sheep2.getType() + ": " + ((Sheep) sheep2).getName());
        sheep2.makeSound();

        System.out.println(cow1.getType() + ": " + ((Cow) cow1).getName());
        cow1.makeSound();

        System.out.println(horse1.getType() + ": " + ((Horse) horse1).getName());
        horse1.makeSound();
      
        ((Sheep) sheep1).setName("New Dolly");
        System.out.println(sheep1.getType() + ": " + ((Sheep) sheep1).getName());
        System.out.println(sheep2.getType() + ": " + ((Sheep) sheep2).getName());
    }
}
