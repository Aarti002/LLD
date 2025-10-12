package StrategyPattern.FightStrategy;

public class SwordWeapon implements Weapons {
    @Override
    public void useWeapon() {
        System.out.println("Fighting with Sword.");
    }
}
