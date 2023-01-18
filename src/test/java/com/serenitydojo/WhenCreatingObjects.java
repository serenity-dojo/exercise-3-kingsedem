package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5,"Woof", true);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
        Assert.assertEquals(fido.makeNoise(), "Woof");
        Assert.assertEquals(fido.feed(), true);

        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());
        System.out.println(fido.makeNoise());
        System.out.println(fido.feed());
    }

    @Test

    public void createAnotherDog(){
        Dog fido = new Dog("Fido","Bone", 5,"Woof", false);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
        Assert.assertEquals(fido.makeNoise(), "Woof");
        Assert.assertEquals(fido.feed(), false);

        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());
        System.out.println(fido.makeNoise());
        System.out.println(fido.feed());

    }

}
