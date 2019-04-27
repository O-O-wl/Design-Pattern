package 디자인패턴.스트래티지패턴.AttackStrategy;

public class AttackStrategyWithKnife implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("칼로 공격합니다.");
    }
}
