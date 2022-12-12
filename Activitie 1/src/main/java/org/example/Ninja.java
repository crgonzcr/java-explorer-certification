package org.example;

public class Ninja extends Human{

    public Ninja() {
        setStealth(10);
    }

    public void steal(Human human) {
        Human.setHealth(human.getHealth() - getStealth());
        setHealth(getHealth() + getStealth());
    }

    public void runAway() {
        setHealth(getHealth() - 10);
    }
}
