package StrategyPattern.FightStrategy;

public class KnifeWeapon implements Weapons {
    @Override
    public void useWeapon() {
        System.out.println("Fighting with Knife");
    }
}
