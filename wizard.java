public class wizard implements character {

	public void attack(){
		wizard_attack1 wAttack = new wizard_attack1();
		System.out.println(wAttack.attack());
	}
	
	public void defend() {
		wizard_defend1 wDefend = new wizard_defend1();
		System.out.println(wDefend.defend());
	}
}
