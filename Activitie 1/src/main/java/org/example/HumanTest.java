package org.example;

public class HumanTest {
    public static void main(String[] args) {

        Human[] human = {new Human(), new Human()};
        human[0].attack(human[1]);

        System.out.println("El humano tiene " + human[1].getHealth() + " puntos de vida");

        Samurai[] samurai = {new Samurai(), new Samurai(), new Samurai(), new Samurai(), new Samurai()};

        System.out.println("Existen un total de " + samurai[0].howMany() + " samurias");

    }
}