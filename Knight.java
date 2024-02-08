public class Knight implements Skill{


    public String attack(){
        String skillAttack = new String();
        skillAttack = "Knight attacks with a sword!\n";
        return skillAttack;
    }
    public String defend(){
        String skillDefend = new String();
        skillDefend = "Using a shield to defend!\n" + "Dodgin to avoid attack!\n" +
        "Creating a magic barrier for defense!\n";
        return skillDefend;
    }
  
  
}