package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    int health;

    int strength;

    String msg;

    public Saxon(int health, int strength) {
        super(health, strength);
        this.health = health;
        this.strength = strength;
    }

    public int attack(int damage) {
        return this.strength;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if(this.health >0){
            this.msg = "A Saxon has received " + damage + " points of damage";
        } else {
            this.msg = "A Saxon has died in combat";
        }
    }

    public String getMsg(){
        return this.msg;
    }

}


