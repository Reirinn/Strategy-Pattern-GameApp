public class game_character {
		
    private character chara;

    public game_character(character chara) {
        this.chara = chara;
    }

    public void attack(){
        chara.attack();
    }

    public void defend(){
        chara.defend();
    }

}
