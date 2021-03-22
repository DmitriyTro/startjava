package com.startjava.lesson_2.wolf;

public class Wolf {

    private String name;
    private String gender;
    private String color;
    private float weight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст.");
        } else {
            this.age = age;
        }
    }

    public boolean hunt() {
        System.out.println("Волк охотится.");
        return true;
    }

    public boolean howl() {
        System.out.println("Волк воет.");
        return true;
    }

    public void move() {
        System.out.println("Волк идет.");
    }

    public void run() {
        System.out.println("Волк бежит.");
    }

    public void sit() {
        System.out.println("Волк сидит.");
    }
}
