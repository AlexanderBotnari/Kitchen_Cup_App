package Kitchen;

public class Cup {
	
	private String liquidName;
    private int liquidVolume;
    
    public  Cup(){}
    public Cup( String liquidName, int liquidVolume ){
        setLiquidName(liquidName);
        setLiquidVolume(liquidVolume);
    }
	public String getLiquidName() {
		return liquidName;
	}
	public void setLiquidName(String liquidName) {
		if(liquidName.equals("Milk") || liquidName.equals("Water") || liquidName.equals("Tea")) {
			this.liquidName = liquidName;
		}else {
			System.err.println("Invalid liquid name !");
		}
	}
	public int getLiquidVolume() {
		return liquidVolume;
	}
	public void setLiquidVolume(int liquidVolume) {
		if(liquidVolume >= 1 && liquidVolume <= 600) {
			this.liquidVolume = liquidVolume;
		}else {
			System.err.println("Incorect liquid volume value !\n"
					+ "Please enter 1 to 600 ml");
		}
	}
}
