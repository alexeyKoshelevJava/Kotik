package animals;

public class Bear extends Carnivorous implements Run, Swim, Voice {
    
    public Bear(String name, int satiety) {
        super(name, satiety);
    }

    @Override
    public void run() {
        System.out.println("Медведь бежит  вприпрыжку");

    }

    @Override
    public void swim() {
        System.out.println("Медведь плывет медленно, но держится на воде хорошо");
    }

    @Override
    public String getVoice() {
        return "ррр-аррррр";

    }


}