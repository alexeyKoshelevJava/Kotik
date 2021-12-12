package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

import java.util.Objects;


public abstract class Animal<T extends Animal> {

    protected int satiety;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public abstract Size getSize();

    public abstract void eat(Food food) throws WrongFoodException;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal<?> animal = (Animal<?>) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
