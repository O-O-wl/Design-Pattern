package 디자인패턴.스트래티지패턴.AttackStrategy;

public class AttackStrategyWithGun implements AttackStrategy{

    @Override
    public void attack() {
        System.out.println("총을 쏩니다.");
    }
}
