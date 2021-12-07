package animals;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count = 0;
    private static final int METHODS = 5;

    public Kotik() {
        createKotic();
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
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

    public void eat(int satiety) {
        this.satiety += satiety;


    }

    public void eat(int satiety, String foodName) {
        this.satiety += satiety;
        System.out.println("Котик ел: " + foodName);

    }

    public void eat() {
        int countSatiety = 1;
        String food = "fish";
        eat(1, food);

    }

    public String[] liveAnotherDay() {
        String[] action = new String[24];
        String[] food = {"fish", "Meet", "Milk", "Chicken", "sour cream"};
        for (int i = 0; i < action.length; i++) {
            int methodNumber = (int) (Math.random() * METHODS) + 1;
            int randomFood = (int) (Math.random() * food.length) + 1;
            int countFood = (int) (Math.random() * 3) + 1;

            switch (methodNumber) {
                case 1:
                    if (play()) {
                        action[i] = i + "- играл";
                    } else {
                        eat(countFood, food[randomFood - 1]);
                        action[i] = i + "- ел";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        action[i] = i + "- спал";
                    } else {
                        eat(countFood);
                        action[i] = i + "- ел";
                    }
                    break;
                case 3:
                    if (walk()) {
                        action[i] = i + "- гулял";
                    } else {
                        eat();
                        action[i] = i + "- ел";
                    }
                    break;
                case 4:
                    if (hunt()) {
                        action[i] = i + "- охотился";
                    } else {
                        eat(countFood, food[randomFood - 1]);
                        action[i] = i + "- ел";
                    }
                    break;
                case 5:
                    if (wash()) {
                        action[i] = i + "- мылся";
                    } else {
                        eat(countFood, food[randomFood - 1]);
                        action[i] = i + "- ел";
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
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }
}
