package main;
import Kitchen.Cup;
import Kitchen.SmallCup;
import Kitchen.BigCup;
import World.Liquid;
public class Aplication {

	public static void main(String[] args) {
       
		//////////Object class Cup//////////////////
		Liquid object = new Liquid("Water", 500, 10);
		Cup standartCup = new Cup(object);
	    System.out.println("Liquid name : "+standartCup.getLiquid().getName());
        System.out.println("Liquid volume : "+standartCup.getLiquid().getVolume()+" ml");
        System.out.println("Liquid temperature : "+standartCup.getLiquid().getTemperature()+" °C");
        System.out.println("---------------------------");
	    object.setVolume(object.getVolume() + 50);
	    System.out.println("Liquid name : "+standartCup.getLiquid().getName());
        System.out.println("Liquid volume + 50 ml: "+standartCup.getLiquid().getVolume()+" ml");
        System.out.println("Liquid temperature : "+standartCup.getLiquid().getTemperature()+" °C");
		System.out.println("Is cold ? -"+object.isCold());
		System.out.println("Is warm ? - "+object.isWarm());
		System.out.println("Is hot ? -"+object.isHot());
		System.out.println("---------------------------");
		///////////////object class Liquid////////////
		Liquid fresh_drink = new Liquid("Suc",200,10);
		System.out.println("Liquid name : "+fresh_drink.getName());
		System.out.println("Liquid volume : "+fresh_drink.getVolume()+" ml");
		System.out.println("Liquid temperature : "+fresh_drink.getTemperature()+" °C");
		System.out.println("Is cold ? -"+fresh_drink.isCold());
		System.out.println("Is warm ? - "+fresh_drink.isWarm());
		System.out.println("Is hot ? -"+fresh_drink.isHot());
		System.out.println("---------------------------");
        ///////////////object class SmallCup////////////
		Liquid object1 = new Liquid("Milk",250,30);
		SmallCup small = new SmallCup(object1);
		System.out.println("Liquid name : "+small.getLiquid().getName());
	    System.out.println("Liquid volume : "+small.getLiquid().getVolume()+" ml");
	    System.out.println("Liquid temperature : "+small.getLiquid().getTemperature()+" °C");
	    System.out.println("Is Warm ? -"+object1.isWarm());
        ///////////////object class BigCup////////////
	    System.out.println("---------------------------");
	    Liquid object2 = new Liquid("Tea",400,40);
		BigCup big = new BigCup(object2);
		System.out.println("Liquid name : "+big.getLiquid().getName());
	    System.out.println("Liquid volume : "+big.getLiquid().getVolume()+" ml");
	    System.out.println("Liquid temperature : "+big.getLiquid().getTemperature()+" °C");
	    System.out.println("Is hot ? -"+object2.isHot());
	}
}





	