package org.example;

public class Human {
    private int strenght = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        health = health;
    }

    public void attack(Human human) {
        human.health -= this.strenght;
    }
}
