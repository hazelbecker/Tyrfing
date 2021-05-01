package com.Tyrfing.engine;

import com.Tyrfing.models.characters.Character;
import com.Tyrfing.models.items.Potion;

import java.util.Random;

public class AttackManager {

    public Random rand;

    public AttackManager(){
        rand = new Random();
    }

    public Integer attackCalculation(Character attacker, Character attacked){

        int dangerTest = rand.nextInt(100);
        if(attacker.getDanger() > dangerTest){
            return -1;
        }

        int mod = attacker.getPower() - attacked.getEndurance();
        if(mod < 0){
            return 0;
        }

        int remainingHP = attacked.getCurrentHealth() - mod;
        if(remainingHP <= 0){
            attacked.setCurrentHealth(0);
            return remainingHP + mod;
        }

        attacked.setCurrentHealth(remainingHP);
        return mod;


    }

    public Integer potionCalculation(Character consumer, Potion potion){

        if(consumer.getCurrentHealth().equals(consumer.getHealth())){
            consumer.setDanger(consumer.getDanger() + potion.getDangerMod());
            return 0;
        }

        if((consumer.getCurrentHealth() + potion.getCurrentHealthMod()) > consumer.getHealth()){
            int previousHealth = consumer.getCurrentHealth();
            consumer.setCurrentHealth(consumer.getHealth());
            consumer.setDanger(consumer.getDanger() + potion.getDangerMod());
            return consumer.getHealth() - previousHealth;
        }

        consumer.setCurrentHealth(consumer.getCurrentHealth() + potion.getCurrentHealthMod());
        consumer.setDanger(consumer.getDanger() + potion.getDangerMod());
        return potion.getCurrentHealthMod();

    }

}
