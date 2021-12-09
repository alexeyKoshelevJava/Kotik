package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice {


    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка хорошо плавает");
    }

    @Override
    public String getVoice() {
        return "Кря-кря";
    }
}
