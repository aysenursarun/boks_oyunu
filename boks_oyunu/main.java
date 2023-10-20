package boks_oyunu;

public class main {

	public static void main(String[] args) {

		Fighter aysenur = new Fighter("Ayse Nur" , 30 , 100, 90, 0);
	      Fighter zeynep = new Fighter("Zeynep" , 15 , 95, 100, 0);
	      Ring r = new Ring(aysenur,zeynep , 90 , 100);
	      r.run();
	}
}
