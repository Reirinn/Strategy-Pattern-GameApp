public class GameCharacter {
    GameApp ga = new GameApp();
    private Skill skill;
    private String character;

    Wizard wizard = new Wizard();
    Knight knight = new Knight();
    Archer archer = new Archer();

    public GameCharacter(String character, Skill skill){
        this.character = character;
        this.skill = skill;
    }

    public String showChara(){
        return "Your character is " + character; 
    }

    
}