package 디자인패턴.팩토리메소드패턴.GameObject.Player;

import 디자인패턴.팩토리메소드패턴.Factory.GameObjectFactory;
import 디자인패턴.팩토리메소드패턴.GameObject.GameObject;

public class Warrior extends Player {
    @Override
    public String toString() {
        return "전사";
    }
}
