package 디자인패턴.팩토리메소드패턴.Factory;

import 디자인패턴.팩토리메소드패턴.GameObject.GameObject;

public abstract class GameObjectFactory {

    public abstract GameObject createGameObject(String type);
}
