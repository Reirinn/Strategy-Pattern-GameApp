import java.util.Scanner;

public class GameApp{
    private static String attri;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Choose a character to use: \n [1] Knight\n [2]Wizard\n [3]Archer\nEnter Selection : ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
            System.out.print("Choose a skill to use: \n [1] Attack\n [2]Defend\n Enter Selection : ");
            int cSkill = input.nextInt();
            switch (cSkill) {
                case 1:
                    GameCharacter gc = new GameCharacter("Knight" , new Knight().attack());
                    attri = "attack"; 
                    System.out.println(gc.showChara());
                    break;
                case 2:  
                    GameCharacter gcs = new GameCharacter("Knight" , new Knight().defend()); 
                    attri = "defend";
                    System.out.println(gcs.showChara());
                    break;  
                default:
                    System.out.println("Input Error");
                    break;
            }
                break;
        
                case 2:
                System.out.print("Choose a skill to use: \n [1] Attack\n [2]Defend\n Enter Selection : ");
                int dSkill = input.nextInt();
                switch (dSkill) {
                    case 1:
                    GameCharacter gc = new GameCharacter("Wizard" , new Wizard().attack());
                    attri = "attack";
                    System.out.println(gc.showChara());
                        break;
                    case 2:  
                    GameCharacter gcs = new GameCharacter("Wizard" , new Wizard().defend());   
                    attri = "defend";
                    System.out.println(gcs.showChara());
                        break;
                    default:
                        System.out.println("Input Error");
                        break;
                }
                    break;

                    case 3:
                    System.out.print("Choose a skill to use: \n [1] Attack\n [2]Defend\n Enter Selection : ");
                    int rSkill = input.nextInt();
                    switch (rSkill) {
                        case 1:
                        GameCharacter gc = new GameCharacter("Archer" , new Archer().attack());
                        attri = "attack";
                        System.out.println(gc.showChara());
                            break;
                        case 2:  
                        GameCharacter gcs = new GameCharacter("Archer" , new Archer().defend());  
                        attri = "defend";
                        System.out.println(gcs.showChara());
                            break;
                        default:
                            System.out.println("Input Error");
                            break;
                    }
                        break;
            default:
                break;
        }

       
    }
}