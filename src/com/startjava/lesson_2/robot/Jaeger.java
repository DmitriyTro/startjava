package com.startjava.lesson_2.robot;

public class Jaeger {

    private String modelName;
    private int mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, int mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getMark() {
        return this.mark;
    }

    public String getOrigin() {
        return this.origin;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWeight() {
        return this.weight;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getArmor() {
        return this.armor;
    }

    public boolean drift() {
        System.out.println(modelName + " вошел в дрифт.");
        return true;
    }

    public void attackKaiju() {
        System.out.println(modelName + " атакует Кайдзю.");
    }

    public void usePlasmaCannon() {
        System.out.println(modelName + " использует плазма пушку.");
    }

    public void move() {
        System.out.println(modelName + " в движении.");
    }
}
