package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;

    private String makeNoise;
    private boolean isFed;


    public static final String DOG_NOISE = "Woof";
    public Dog(String name, String favoriteToy, int age, String makeNoise, boolean isFed) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.makeNoise = makeNoise;
        this.isFed = true;
    }


    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise(){
        return DOG_NOISE;
    }

    public boolean feed(){
        return isFed;
    }
}
