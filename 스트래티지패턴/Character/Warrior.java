package 디자인패턴.스트래티지패턴.Character;

import 디자인패턴.스트래티지패턴.AttackStrategy.AttackStrategy;
import 디자인패턴.스트래티지패턴.AttackStrategy.AttackStrategyWithKnife;
import 디자인패턴.스트래티지패턴.MoveStrategy.MoveStrategy;
import 디자인패턴.스트래티지패턴.MoveStrategy.RunStrategy;

public class Warrior extends Character{
    public Warrior() {
        super(new AttackStrategyWithKnife(), new RunStrategy());
    }
}
