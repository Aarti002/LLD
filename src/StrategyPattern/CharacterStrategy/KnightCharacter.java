package StrategyPattern.CharacterStrategy;

import StrategyPattern.FightStrategy.Weapons;

public class KnightCharacter extends Character {
    Weapons fightingWeapon;

    public KnightCharacter(Weapons w) {
        this.fightingWeapon = w;
    }

    @Override
    public void powerLevel() {
        System.out.println("Knight!");
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
