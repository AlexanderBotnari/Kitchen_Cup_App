package World;

public class DrinkableLiquid extends Liquid{

	private String category;
	
	public DrinkableLiquid () {}
	public DrinkableLiquid(String category, String name,Integer volume, Integer temperature) {
		super( name ,volume, temperature);
		setCategory(category);
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
