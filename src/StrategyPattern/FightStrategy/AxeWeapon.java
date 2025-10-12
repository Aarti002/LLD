package StrategyPattern.FightStrategy;

public class AxeWeapon implements Weapons {
    @Override
    public void useWeapon() {
        System.out.println("Fighting with Axe.");
    }
}
