package World;

public class DangerousLiquid extends Liquid{
      
	private String level;
	
	public DangerousLiquid() {}
    public DangerousLiquid(String level, String name,Integer volume, Integer temperature) {
    	super( name ,volume, temperature);
    	setLevel(level);
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}
