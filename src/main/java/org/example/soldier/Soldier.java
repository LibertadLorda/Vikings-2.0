package org.example.soldier;

public class Soldier {

    public int health;

    public int strength;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack(){
        return this.strength;
    }

    public void receiveDamage(int damage){
        this.health-= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

}


