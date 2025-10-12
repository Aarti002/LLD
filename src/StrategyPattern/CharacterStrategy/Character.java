package StrategyPattern.CharacterStrategy;

import StrategyPattern.FightStrategy.Weapons;

public abstract class Character {
    public abstract void setWeapon(Weapons w);

    public abstract void powerLevel();

    public abstract void fight();
}
