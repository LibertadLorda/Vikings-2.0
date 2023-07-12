package org.example.soldier;

public class Soldier {

    int health;

    int strength;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack(int damage){
        return this.strength;
    }

    public void receiveDamage(int damage){
        this.health-= damage;

    }
}


