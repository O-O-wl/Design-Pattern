package 디자인패턴.스트래티지패턴.Character;

import 디자인패턴.스트래티지패턴.AttackStrategy.AttackStrategyWithGun;
import 디자인패턴.스트래티지패턴.MoveStrategy.RunStrategy;

public class Gunner extends Character {

    public Gunner() {
        super(new AttackStrategyWithGun(),new RunStrategy());
    }

}
