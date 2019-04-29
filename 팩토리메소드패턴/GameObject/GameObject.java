package 디자인패턴.팩토리메소드패턴.GameObject;

public abstract class GameObject {

    int hp;
    int powerPoint;
    int defensePoint;

    public void hello(){
        System.out.println("안녕하세요!"+this+"가 생성되었습니다");
    }
}
