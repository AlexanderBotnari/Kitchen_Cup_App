package main;
import Kitchen.Cup;
import Kitchen.SmallCup;
import Kitchen.BigCup;
import World.DangerousLiquid;
import World.DrinkableLiquid;
import World.Liquid;
import static Tools.LiquidTester.isDrinkable;
public class Aplication {

	public static void main(String[] args) {
       
		Liquid object = new Liquid("Water", 500, 10);
		Cup standartCup = new Cup(object);
	    System.out.println("Liquid name : "+standartCup.getLiquid().getName());
        System.out.println("Liquid volume : "+standartCup.getLiquid().getVolume()+" ml");
        System.out.println("Liquid temperature : "+standartCup.getLiquid().getTemperature()+" °C");
        System.out.println("---------------------------");
	    object.setVolume(object.getVolume() + 50);
	    System.out.println("Liquid name : "+standartCup.getLiquid().getName());
        System.out.println("Liquid volume + 50 ml: "+standartCup.getLiquid().getVolume()+" ml");
        System.out.println("Liquid temperature: "+standartCup.getLiquid().getTemperature()+" °C");
		System.out.println("Is cold ? -"+object.isCold());
		System.out.println("Is warm ? - "+object.isWarm());
		System.out.println("Is hot ? -"+object.isHot());
		System.out.println("---------------------------");
		
		DrinkableLiquid object1 = new DrinkableLiquid("Fresh","Water",500,5);
		BigCup bigCup = new BigCup(object1);
		 System.out.println("Liquid name : "+bigCup.getLiquid().getName());
         System.out.println("Liquid category : "+bigCup.getLiquid().getCategory());
		 System.out.println("Liquid volume: "+bigCup.getLiquid().getVolume()+" ml");
		 System.out.println("Liquid temperature: "+bigCup.getLiquid().getTemperature()+" °C");
		 System.out.println("This liquid is consumable ?:"+isDrinkable(bigCup));
		 System.out.println("---------------------------");
		 
		DangerousLiquid object2 = new DangerousLiquid("Toxic","Acetona",300,1);
	    SmallCup smallCup = new SmallCup(object2);
	     System.out.println("Liquid name : "+smallCup.getLiquid().getName());
	     System.out.println("Liquid dangerous level : "+smallCup.getLiquid().getLevel());
		 System.out.println("Liquid volume: "+smallCup.getLiquid().getVolume()+" ml");
		 System.out.println("Liquid temperature: "+smallCup.getLiquid().getTemperature()+" °C");
		 System.out.println("This liquid is consumable ?:"+isDrinkable(smallCup));
	}
	
}





	