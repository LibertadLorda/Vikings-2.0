package org.example.war;

import java.util.ArrayList;

import java.util.List;

import org.example.vikins.Viking;

import org.example.saxon.Saxon;

public class War {

    public List<Viking> vikingArmy = new ArrayList<>();

    public List<Saxon> saxonArmy = new ArrayList<>();

    public void addViking(Viking viking) {
        this.vikingArmy.add(viking);
    }

    public List<Viking> getVikingArmy() {
        return vikingArmy;
    }

    public void addSaxon(Saxon saxon) {
        this.saxonArmy.add(saxon);
    }

    public List<Saxon> getSaxonArmy() {
        return saxonArmy;
    }

    public String vikingAttack() {
        int randomVikingIndex = (int) Math.floor(Math.random() * vikingArmy.size());
        int Damage = vikingArmy.get(randomVikingIndex).attack();

        int randomSaxonIndex = (int) Math.floor(Math.random() * saxonArmy.size());

        saxonArmy.get(randomSaxonIndex).receiveDamage(Damage);
        String msg = saxonArmy.get(randomSaxonIndex).getMsg();

        if (saxonArmy.get(randomSaxonIndex).getHealth() <= 0) {
            saxonArmy.remove(randomSaxonIndex);
        }
        return msg;
    }

    public String saxonAttack() {
        int randomSaxonIndex = (int) Math.floor( Math.random() * saxonArmy.size());
        int Damage = saxonArmy.get(randomSaxonIndex).attack();

        int randomVikingIndex = (int) Math.floor(Math.random() * vikingArmy.size());
        vikingArmy.get(randomVikingIndex).receiveDamage(Damage);

        String msg = vikingArmy.get(randomVikingIndex).getMsg();

        if (vikingArmy.get(randomVikingIndex).getHealth() <= 0) {
            vikingArmy.remove(randomVikingIndex);

        }
        return msg;
    }
        public String showStatus(){
            if((this.vikingArmy.size() == 0) && (this.saxonArmy.size()!=0)){
                return "Saxons have fought for their lives and survive another day...";
            }
            else if((this.vikingArmy.size()!=0) && (this.saxonArmy.size()==0)){
                return "Vikings have won the war of the century!";
            }
            else{
                return "Vikings and Saxons are still in the thick of battle.";
            }
        }
    }






