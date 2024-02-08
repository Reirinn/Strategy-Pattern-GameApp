public class GameCharacter {
    GameApp ga = new GameApp();
    private Skill skill;
    private String character;

    Wizard wizard = new Wizard();
    Knight knight = new Knight();
    Archer archer = new Archer();

    public GameCharacter(String character, String string){
        this.character = character;
        this.skill = skill;
    }

    public String showChara(){
        if (character.equals("Knight"))
        { 
         return "Your character is " + character + " and you choose to " + knight.attack();
        }

        else if (character.equals("Wizard")){
        return "Your character is " + character + " and you choose to " + wizard.attack();
        }

        else if (character.equals("Archer")){
            return "Your character is " + character + " and you choose to " + archer.attack();
            }
        
        return "error";
    }

    public String showSkill(){
        
    }
}