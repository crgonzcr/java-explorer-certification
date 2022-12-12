package org.example;

public class Samurai extends Human{
    private  static int contSamurais = 0;
    public Samurai() {
        ++contSamurais;
        setStrenght(200);
    }

    public void deathBlow(Human human) {
        human.setHealth(0);
        setHealth(getHealth() / 2);
    }

    public void meditate() {
        setHealth(getHealth() + (getHealth() / 2));
    }

    public int howMany() {
        return contSamurais;
    }
}
