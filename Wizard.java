public class Wizard implements Skill{

    public String attack(){
        String skillAttack = new String();
        skillAttack = "Wizard casts a spell!\n";
        return skillAttack;
    }
    public String defend(){
        String skillDefend = new String();
        skillDefend = "Creating a magic barrier for defense!\n";
        return skillDefend;
    }
    
}