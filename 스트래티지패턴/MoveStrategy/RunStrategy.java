package 디자인패턴.스트래티지패턴.MoveStrategy;

public class RunStrategy implements MoveStrategy{
    @Override
    public void move() {
      run();
    }
    private void run(){
        System.out.println("뛰어서 이동합니다.");
    }
}
