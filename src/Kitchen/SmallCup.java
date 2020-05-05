package Kitchen;

import World.Liquid;

public class SmallCup extends Cup{  
	
	final static int Small_MAX_VOLUME = 250;
	
	public SmallCup() {}
    public SmallCup(Liquid liquid) {
    	super(liquid);
    }
	public void setLiquid(Liquid liquid) {
		if (liquid.getVolume() <= Small_MAX_VOLUME) {
		this.liquid = liquid;
		} else {
            System.err.println("The Max Volume of small cup is 250 ml !");
	    }
	}
}
