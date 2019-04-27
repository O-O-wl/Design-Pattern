package 디자인패턴.스트래티지패턴.Game;

import 디자인패턴.스트래티지패턴.Character.Gunner;
import 디자인패턴.스트래티지패턴.Character.Warrior;
import 디자인패턴.스트래티지패턴.MoveStrategy.DriveStrategy;

public class Main {
    public static void main(String[] arg){
        Gunner gunner = new Gunner();
        gunner.move();      // 뛰어서 이동합니다.
        gunner.setMoveStrategy(new DriveStrategy());
        gunner.move();      // 차를 타고 이동합니다.
        gunner.attack();    // 총으로 공격합니다.

        Warrior warrior = new  Warrior();
        warrior.attack();   // 칼로 공격합니다.


    }
}
