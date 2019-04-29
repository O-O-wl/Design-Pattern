package 디자인패턴.팩토리메소드패턴.Factory;

import 디자인패턴.팩토리메소드패턴.GameObject.GameObject;
import 디자인패턴.팩토리메소드패턴.GameObject.Monster.Slime;
import 디자인패턴.팩토리메소드패턴.GameObject.Monster.Zombie;

public class MonsterFactory extends GameObjectFactory{
    @Override
    public GameObject createGameObject(String type) {
        switch (type){
            case "Slime":
                return new Slime();
            case "Zombie":
                return new Zombie();
        }
        return null;
    }
}
