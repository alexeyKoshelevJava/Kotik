package animals;

public class Fish extends Carnivorous implements Swim {


    public Fish(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плывет быстро");
    }


}
