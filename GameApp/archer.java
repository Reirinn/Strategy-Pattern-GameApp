public class archer implements character {

	public void attack(){
		archer_attack1 aAttack = new archer_attack1();
		System.out.println(aAttack.attack());
	}
	
	public void defend() {
		archer_defend1 aDefend = new archer_defend1();
		System.out.println(aDefend.defend());
	}
}
