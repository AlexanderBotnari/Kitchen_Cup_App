package main;
import Kitchen.Cup;
import Kitchen.SmallCup;
import Kitchen.BigCup;

public class Aplication {

	public static void main(String[] args) {
		Cup cupA = new Cup("Milk", 300);
        Cup cupB = new Cup("Water",500);
        cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
        cupB.setLiquidVolume(cupB.getLiquidVolume()+50);
        System.out.println("Cup A: "+cupA.getLiquidName()+" "+ cupA.getLiquidVolume()+" ml");
        System.out.println("Cup B: "+cupB.getLiquidName()+" "+ cupB.getLiquidVolume()+" ml");
		SmallCup small = new SmallCup("Tea", 200);
		System.out.println("Small Cup: "+small.getLiquidName()+" "+small.getLiquidVolume()+" ml");
        BigCup big = new BigCup("Water", 200);
        big.setLiquidVolume(big.getLiquidVolume() + cupB.getLiquidVolume());
        System.out.println("Big Cup: "+big.getLiquidName()+" "+big.getLiquidVolume()+" ml");
	 }
}
