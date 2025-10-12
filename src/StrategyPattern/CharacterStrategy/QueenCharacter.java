package StrategyPattern.CharacterStrategy;

import StrategyPattern.FightStrategy.Weapons;

public class QueenCharacter extends Character {
    Weapons fightingWeapon;

    public QueenCharacter(Weapons w) {
        this.fightingWeapon = w;
    }

    @Override
    public void powerLevel() {
        System.out.println("Queen!");
    }

    @Override
    public void fight() {
        fightingWeapon.useWeapon();
    }

    @Override
    public void setWeapon(Weapons w) {
        this.fightingWeapon = w;
    }
}
