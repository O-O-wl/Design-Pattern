package 디자인패턴.팩토리메소드패턴.Game;

        import 디자인패턴.팩토리메소드패턴.Factory.MonsterFactory;
        import 디자인패턴.팩토리메소드패턴.Factory.PlayerFactory;
        import 디자인패턴.팩토리메소드패턴.Generator.Generator;

public class Game {
    public static void main(String [] arg){
        Generator generator = new Generator();
        generator.setFactory(new PlayerFactory());
        generator.generate("Warrior");
        generator.generate("Wizard");

        generator.setFactory(new MonsterFactory());
        generator.generate("Slime");
        generator.generate("Zombie");
    }
}
