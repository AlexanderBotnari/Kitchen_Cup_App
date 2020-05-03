package Kitchen;

public class BigCup extends Cup{
	
	private int liquidVolume;
	
	public BigCup() {}
	public BigCup(  String liquidName, int liquidVolume) {
	    setLiquidVolume(liquidVolume);
	    setLiquidName(liquidName);
	}
	
	public int getLiquidVolume() {
		return liquidVolume;
	}
	public void setLiquidVolume(int liquidVolume) {
    	if(liquidVolume >= 0 && liquidVolume <= 1000) {
    		this.liquidVolume = liquidVolume;
    	}else {
    		System.err.println("Incorect liquid volume value !\n"
					+ "Please enter 0 to 1000 ml");
    	}
    }
}