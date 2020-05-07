package Tools;

import Kitchen.Cup;
import World.DrinkableLiquid;

public class LiquidTester {

	 public static Boolean isDrinkable(Cup cup ) {
		return cup.getLiquid() instanceof DrinkableLiquid;
	}                                          
}
