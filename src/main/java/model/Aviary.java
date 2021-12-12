package model;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private Size size;
    private Map<String, T> mapAmimals = new HashMap<>();

    public Aviary(Size size) {
        this.size = size;
    }


    public void addAnimal(T animal) {

        if (this.size == animal.getSize()) {
            mapAmimals.put(animal.getName(), animal);
        } else {
            throw new WrongSizeException();
        }


    }

    public T getAnimal(String name) {
        return mapAmimals.get(name);

    }

    public boolean removeAnimal(String name) {
        if (mapAmimals.containsKey(name)) {
            mapAmimals.remove(name);
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
        return mapAmimals;
    }

    public void setMapAmimals(Map<String, T> mapAmimals) {
        this.mapAmimals = mapAmimals;
    }
}
