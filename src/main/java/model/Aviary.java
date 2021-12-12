package model;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private Size size;
    private HashMap<String, T> aviaryMap = new HashMap<>();

    public Aviary(Size size) {
        this.size = size;
    }


    public void addAnimal(T animal) {

        if (this.size == animal.getSize()) {
            aviaryMap.put(animal.getName(), animal);
        } else {
            throw new WrongSizeException();
        }


    }

    public T getAnimal(String name) {
        return aviaryMap.get(name);

    }

    public boolean removeAnimal(String name) {
        if (aviaryMap.containsKey(name)) {
            aviaryMap.remove(name);
            return true;
        } else {
            return false;
        }


    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Map<String, T> getMapAmimals() {
        return aviaryMap;
    }

    public void setAviaryMap(HashMap<String, T> aviaryMap) {
        this.aviaryMap = aviaryMap;
    }
}
