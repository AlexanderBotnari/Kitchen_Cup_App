package main;
import Kitchen.Cup;
public class Aplication {

	public static void main(String[] args) {
		Cup cupA = new Cup("Milk", 300);
        Cup cupB = new Cup("Water",500);
        cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
        cupB.setLiquidVolume(cupB.getLiquidVolume()+50);
        System.out.println("Cup A: "+cupA.getLiquidName()+" "+ cupA.getLiquidVolume()+" ml");
        System.out.println("Cup B: "+cupB.getLiquidName()+" "+ cupB.getLiquidVolume()+" ml");
     }
	
}
