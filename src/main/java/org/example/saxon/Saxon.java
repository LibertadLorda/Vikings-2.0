package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    String msg;

    public Saxon(int health, int strength) {
        super(health, strength);
    }

    public int attack() {
        return super.attack();
    }

    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if (this.health <= 0) {
            this.setMsg("A Saxon has died in act of combat");
        } else {
            this.setMsg("A Saxon has received " + damage + " points of damage");
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}