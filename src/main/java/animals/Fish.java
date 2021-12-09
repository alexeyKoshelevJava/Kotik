package animals;

public class Fish extends Carnivorous implements Swim {


    public Fish(int satiety) {
        super(satiety);
    }

    @Override
    public void swim() {
        System.out.println("Рыба плывет быстро");
    }


}
