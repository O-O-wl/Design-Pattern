package 디자인패턴.스트래티지패턴.Character;

import 디자인패턴.스트래티지패턴.AttackStrategy.AttackStrategy;
import 디자인패턴.스트래티지패턴.AttackStrategy.AttackStrategyWithGun;
import 디자인패턴.스트래티지패턴.MoveStrategy.MoveStrategy;

public abstract class Character{

    public AttackStrategy attackStrategy;
    public MoveStrategy moveStrategy;


    public Character(AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        this.attackStrategy = attackStrategy;
        this.moveStrategy = moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

}

