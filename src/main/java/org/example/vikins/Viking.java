package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier {

   String name;

   int health;

   int strength;
   private String msg;


   public Viking(String name, int health, int strength) {
      super(health, strength);
      this.name = name;
      this.health = health;
      this.strength = strength;
   }

   public int attack(int damage){
      return this.strength;
   }

   public void receiveDamage(int damage){
      this.health-= damage;
      if(this.health >0){
         this.msg = this.name + "has received " + damage + " points of damage";
      } else {
         this.msg = this.name + "has died in combat";
      }
   }

   public String battleCry(){
      return "Odin Owns You All!";

   }

   public String getMsg(){
      return this.msg;
   }
}
