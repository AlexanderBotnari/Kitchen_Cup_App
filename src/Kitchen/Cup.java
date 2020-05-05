package Kitchen;

import World.Liquid;

public class Cup{
     
	protected Liquid liquid;
    final static int MAX_VOLUME = 600;
	
    public Cup() {}
    public Cup(Liquid liquid) {
        setLiquid(liquid);
    }
	public Liquid getLiquid() {
		return liquid;
	}
	public void setLiquid(Liquid liquid) {
		if (liquid.getVolume() <= MAX_VOLUME) {
		this.liquid = liquid;
		} else {
            System.err.println("The Max Volume of cup is 600 ml !");
	    }
	}
}
