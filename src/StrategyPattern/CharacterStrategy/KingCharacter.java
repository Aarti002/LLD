package StrategyPattern.CharacterStrategy;

import StrategyPattern.FightStrategy.Weapons;

public class KingCharacter extends Character {
    Weapons fightingWeapon;

    public KingCharacter(Weapons w) {
        this.fightingWeapon = w;
    }

    @Override
    public void powerLevel() {
        System.out.println("King!");
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
