public class knight implements character {

	public void attack(){
		knight_attack1 kAttack = new knight_attack1();
		System.out.println (kAttack.attack());
	}
	

	public void defend() {
		knight_defend1 kd1 = new knight_defend1();
		knight_defend2 kd2 = new knight_defend2();
		knight_defend3 kd3 = new knight_defend3();
		
		System.out.println(kd1.defend() + "\n" + kd2.defend() + "\n" + kd3.defend());

	
	}
}
