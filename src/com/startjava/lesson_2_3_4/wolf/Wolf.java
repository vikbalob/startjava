package com.startjava.lesson_2_3_4.wolf;

public class Wolf {

    private String sex = "male";
    private String name = "Snow";
    private float weight = 15.0f;
    private int age = 5;
    private String color = "grey";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (age > 8 || age < 0) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean go() {
        return true;
    }

    public boolean sit() {
        return true;
    }

    public String run() {
        return "I`m running!";
    }

    public String howl() {
        return "Auuu!!";
    }

    public String hunt() {
        return "Looking for prey";
    }
}