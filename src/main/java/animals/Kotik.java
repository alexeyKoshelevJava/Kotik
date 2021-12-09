package animals;

import food.Food;


public class Kotik extends Carnivorous implements Run, Voice {


    private static int count = 0;
    private static final int METHODS = 5;


    public Kotik(String name, int satiety) {
        super(name, satiety);
        createKotic();
    }


    public void createKotic() {
        count++;
    }


    public boolean play() {
        if (isTheCatFull()) {
            System.out.println("Котик играет");
            satiety--;
            return true;
        } else return false;

    }

    public boolean sleep() {
        if (isTheCatFull()) {
            System.out.println("Котик спит");
            satiety--;
            return true;
        } else return false;
    }

    public boolean walk() {
        if (isTheCatFull()) {
            System.out.println("Котик гуляет");
            satiety--;
            return true;
        } else return false;
    }

    public boolean hunt() {
        if (isTheCatFull()) {
            System.out.println("Котик охотится");
            satiety--;
            return true;
        } else return false;
    }

    public boolean wash() {
        if (isTheCatFull()) {
            System.out.println("Котик моется");
            satiety--;
            return true;
        } else return false;
    }

    public boolean isTheCatFull() {
        if (satiety <= 0) {
            return false;
        } else return true;
    }


    public String[] liveAnotherDay(Food food) {
        String[] action = new String[24];
        for (int i = 0; i < action.length; i++) {
            int methodNumber = (int) (Math.random() * METHODS) + 1;

            switch (methodNumber) {
                case 1:
                    if (play()) {
                        action[i] = i + " - играл";
                    } else {
                        eat(food);
                        action[i] = i + " - ел";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        action[i] = i + " - спал";
                    } else {
                        eat(food);
                        action[i] = i + " - ел";
                    }
                    break;
                case 3:
                    if (walk()) {
                        action[i] = i + " - гулял";
                    } else {
                        eat(food);
                        action[i] = i + " - ел";
                    }
                    break;
                case 4:
                    if (hunt()) {
                        action[i] = i + " - охотился";
                    } else {
                        eat(food);
                        action[i] = i + " - ел";
                    }
                    break;
                case 5:
                    if (wash()) {
                        action[i] = i + " - мылся";
                    } else {
                        eat(food);
                        action[i] = i + " - ел";
                    }
                    break;
            }
        }
        return action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return "мяу-мяу";
    }


    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run() {
        System.out.println("Котик бежит совсем неслышно");
    }
}
