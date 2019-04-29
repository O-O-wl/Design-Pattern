package 디자인패턴.팩토리메소드패턴.Factory;

import 디자인패턴.팩토리메소드패턴.GameObject.GameObject;
import 디자인패턴.팩토리메소드패턴.GameObject.Player.Warrior;
import 디자인패턴.팩토리메소드패턴.GameObject.Player.Wizard;

public class PlayerFactory extends GameObjectFactory{

    @Override
    public GameObject createGameObject(String type) {
        switch (type){
            case "Warrior":
                return new Warrior();
            case "Wizard":
                return new Wizard();
        }
        return null;
    }
}
