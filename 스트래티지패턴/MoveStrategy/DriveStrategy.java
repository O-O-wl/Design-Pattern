package 디자인패턴.스트래티지패턴.MoveStrategy;

public class DriveStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("차를 타고 이동합니다.");
    }
}
