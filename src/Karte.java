public class Karte {

	private int broj;
	private int vrijednost;
	private char znak;

	// Konstruktor

	public Karte(int broj) {
		this.broj = broj % 13;
		this.broj++;
		if (this.broj == 1) {
			this.vrijednost = 11;
		}
		if (this.broj >= 10) {
			this.vrijednost = 10;
		} else {
			this.vrijednost = this.broj;
		}
		if (this.broj >= 11) {
			this.broj++;
		}
		this.znak = (char) (broj / 13);
		if (this.znak == 0) {
			this.znak = 'S';//Srce
		}
		if (this.znak == 1) {
			this.znak = 'L';//List
		}
		if (this.znak == 2) {
			this.znak = 'B';//Baklava
		}
		if (this.znak == 3) {
			this.znak = 'D';//Djetelina
		}
	}

	/**
	 * 
	 * Funkcija ispisuje ove karte po broju, znaku i vrijednosti
	 */

	public String toString() {
		String str = "";
		//str += "Broj: " + this.broj + "\n";
		str += "Karta: "+this.vrijednost+" " + this.znak + "\n";
		//str += "Vrijenost: " + this.vrijednost + "\n";
		return str;

	}
	public void mjesanje(){
		Karte temp;
		for(int i =0;i<toString().length();i++){
			int index1=(int)(Math.random()*52);
			int index2=(int)(Math.random()*52);
			temp=Karte[index1];
			index1=index2;
			Karte=index2;
		}
	}
	

}
