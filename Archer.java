public class Archer implements Skill{

    public String attack(){
        String skillAttack = new String();
        skillAttack = "Archer shoots an arrow!\n";
        return skillAttack;
    }
    public String defend(){
        String skillDefend = new String();
        skillDefend = "Using a shield to defend!\n";
        return skillDefend;
    }

    
}   