package 디자인패턴.팩토리메소드패턴.Generator;

import 디자인패턴.팩토리메소드패턴.Factory.GameObjectFactory;
import 디자인패턴.팩토리메소드패턴.GameObject.GameObject;

public class Generator {

    GameObjectFactory factory;

    public void setFactory(GameObjectFactory factory) {
        this.factory = factory;
    }

    public GameObject generate(String type){
        GameObject gameObject = factory.createGameObject(type);
        gameObject.hello();
        return gameObject;
    }
}
