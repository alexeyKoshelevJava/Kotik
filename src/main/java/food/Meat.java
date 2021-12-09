package food;

public class Meat extends Food {


    public Meat(String nameFood) {
        super(nameFood);
    }

    @Override
    public int getEnergy() {
        return 5;
    }


    @Override
    public String toString() {
        return "Meat{" +
                "nameMeet='" + nameFood + '\'' +
                '}';
    }
}
