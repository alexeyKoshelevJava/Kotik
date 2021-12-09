package food;

public class Grass extends Food {


    public Grass(String nameFood) {
        super(nameFood);
    }


    @Override
    public int getEnergy() {
        return 1;
    }

    @Override
    public String toString() {
        return "Grass{" +
                "nameGrass='" + nameFood + '\'' +
                '}';
    }
}
