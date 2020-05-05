package Kitchen;

import World.Liquid;

public class BigCup extends Cup{
	
	final static int Big_MAX_VOLUME = 1000;
	
	public BigCup() {}
    public BigCup(Liquid liquid) {
    	super(liquid);
    }
	public void setLiquid(Liquid liquid) {
		if (liquid.getVolume() <=  Big_MAX_VOLUME) {
		this.liquid = liquid;
		} else {
            System.err.println("The Max Volume of big cup is 1000 ml !");
	    }
	}
}
