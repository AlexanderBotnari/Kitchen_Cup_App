package main;
import Kitchen.Cup;
import Kitchen.SmallCup;
import Kitchen.BigCup;
import World.Liquid;
public class Aplication {

	public static void main(String[] args) {
		Cup cupA = new Cup("Milk", 300);
        Cup cupB = new Cup("Water",500);
        cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
        cupB.setLiquidVolume(cupB.getLiquidVolume()+50 );
        System.out.println("Cup A: "+cupA.getLiquidName()+" "+ cupA.getLiquidVolume()+" ml");
        System.out.println("Cup B before being poured: "+cupB.getLiquidName()+" "+ cupB.getLiquidVolume()+" ml");
		SmallCup small = new SmallCup("Tea", 200);
		System.out.println("Small Cup: "+small.getLiquidName()+" "+small.getLiquidVolume()+" ml");
        BigCup big = new BigCup("Water", 200);
        System.out.println("Big Cup: " +big.getLiquidName()+" "+ big.getLiquidVolume()+" ml");
        big.setLiquidVolume(big.getLiquidVolume() + cupB.getLiquidVolume());
        System.out.println("Big Cup + Cup B: "+big.getLiquidName()+" "+big.getLiquidVolume()+" ml");
        cupB.setLiquidVolume(0);
        System.out.println("The liquid left in the Cup B: "+ cupB.getLiquidVolume() +" ml");
        System.out.println("-------------------------------------------");
///////////////////Model-1/////////////////////////////////		
		Liquid fresh_drink = new Liquid("Suc",200,10);
		System.out.println("Liquid name : "+fresh_drink.getName());
		System.out.println("Liquid volume : "+fresh_drink.getVolume()+" ml");
		System.out.println("Liquid temperature : "+fresh_drink.getTemperature()+" °C");
		System.out.println("Is cold ? -"+fresh_drink.isCold());
		System.out.println("Is warm ? - "+fresh_drink.isWarm());
		System.out.println("Is hot ? -"+fresh_drink.isHot());
///////////////////Model-2/////////////////////////////////	
		Liquid warm_drink = new Liquid("Punch",300,25);
		System.out.println("Liquid name : "+warm_drink.getName());
		System.out.println("Liquid volume : "+warm_drink.getVolume()+" ml");
		System.out.println("Liquid temperature : "+warm_drink.getTemperature()+" °C");
		System.out.println("Is cold ? -"+warm_drink.isCold());
		System.out.println("Is warm ? - "+warm_drink.isWarm());
		System.out.println("Is hot ? -"+warm_drink.isHot());
///////////////////Model-3/////////////////////////////////	
		Liquid hot_drink = new Liquid("Cofee",100,40);
		System.out.println("Liquid name : "+hot_drink.getName());
		System.out.println("Liquid volume : "+hot_drink.getVolume()+" ml");
		System.out.println("Liquid temperature : "+hot_drink.getTemperature()+" °C");
		System.out.println("Is cold ? -"+hot_drink.isCold());
		System.out.println("Is warm ? - "+hot_drink.isWarm());
		System.out.println("Is hot ? -"+hot_drink.isHot());
	 }
}
