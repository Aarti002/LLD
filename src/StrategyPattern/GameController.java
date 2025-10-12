package StrategyPattern;

import StrategyPattern.CharacterStrategy.Character;
import StrategyPattern.CharacterStrategy.KingCharacter;
import StrategyPattern.CharacterStrategy.KnightCharacter;
import StrategyPattern.CharacterStrategy.QueenCharacter;
import StrategyPattern.FightStrategy.AxeWeapon;
import StrategyPattern.FightStrategy.KnifeWeapon;
import StrategyPattern.FightStrategy.SwordWeapon;
import StrategyPattern.FightStrategy.Weapons;

public class GameController {
    public static void main(String args[]) {
        Weapons sword = new SwordWeapon();
        Character kingCharacter = new KingCharacter(sword);
        kingCharacter.powerLevel();
        kingCharacter.fight();

        Weapons knife = new KnifeWeapon();
        Character queenCharacter = new QueenCharacter(knife);
        queenCharacter.powerLevel();
        queenCharacter.fight();
        queenCharacter.setWeapon(sword);
        queenCharacter.fight();

        Weapons axe = new AxeWeapon();
        Character knightCharacter = new KnightCharacter(axe);
        knightCharacter.powerLevel();
        knightCharacter.fight();
    }
}
