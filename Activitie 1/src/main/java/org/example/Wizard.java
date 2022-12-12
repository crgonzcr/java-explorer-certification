package org.example;

public class Wizard extends Human{


    public Wizard() {
        setHealth(50);
        setIntelligence(8);
    }

    public void heal(Human human) {
        human.setHealth(human.getHealth() + (getIntelligence() * 3));
    }
}
