package com.startjava.lesson_2.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setName("Amelia");
        System.out.println("Кличка волка = " + wolf.getName());

        wolf.setGender("female");
        System.out.println("Пол волка = " + wolf.getGender());

        wolf.setColor("brown");
        System.out.println("Цвет волка = " + wolf.getColor());

        wolf.setWeight(27.6f);
        System.out.println("Вес волка = " + wolf.getWeight());

        wolf.setAge(6);
        System.out.println("Возраст волка = " + wolf.getAge());

        wolf.hunt();
        wolf.howl();
        wolf.move();
        wolf.run();
        wolf.sit();
        System.out.println(wolf.howl());
        System.out.println(wolf.hunt());
    }
}
