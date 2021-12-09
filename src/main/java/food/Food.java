package food;

public abstract class Food {
    protected String nameFood;

    public Food(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    abstract int getEnergy();
}
