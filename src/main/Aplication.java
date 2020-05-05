package main;
import Kitchen.Cup;
import Kitchen.SmallCup;
import Kitchen.BigCup;
import World.Liquid;
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
        System.out.println("Liquid temperature : "+standartCup.getLiquid().getTemperature()+" °C");
		System.out.println("Is cold ? -"+object.isCold());
		System.out.println("Is warm ? - "+object.isWarm());
		System.out.println("Is hot ? -"+object.isHot());

	}
}





	