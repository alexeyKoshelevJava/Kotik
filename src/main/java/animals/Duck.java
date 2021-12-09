package animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    public Duck(int satiety) {
        super(satiety);
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }


    @Override
    public void run() {
        System.out.println("Утка бежит");
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
