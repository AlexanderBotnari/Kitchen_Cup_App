package Kitchen;

public class SmallCup extends Cup{  
	
    public SmallCup() {}
	public SmallCup( String liquidName, int liquidVolume) {
	    setLiquidVolume(liquidVolume);
	    setLiquidName(liquidName);
	}
	public void setLiquidVolume(int liquidVolume) {
    	if(liquidVolume >= 0 && liquidVolume <= 250) {
    		super.setLiquidVolume(liquidVolume);
    	}else {
    		System.err.println("Incorect liquid volume value !\n"
					+ "Please enter 0 to 250 ml");
    	}
    }
}
