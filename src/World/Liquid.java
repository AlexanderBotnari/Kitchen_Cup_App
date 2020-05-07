package World;

public class Liquid{
       
	private String name;
	private Integer volume;
	private Integer temperature;
	
	public Liquid() {}
    public Liquid(String name, Integer volume, Integer temperature) {
		setName(name);
		setVolume(volume);
		setTemperature(temperature);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() == 0) {
			System.err.println("The name cannot be empty");
		}else {
			this.name = name;
		}
		}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		if(volume <= 0) {
			System.err.println("The volume cannot be negative or equal to 0 !");
		}else {
			this.volume = volume;
		}
		}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		if(temperature >= 0 && temperature <= 100) {
			this.temperature = temperature;
		 if(temperature == 0) 
			            	System.out.println("All liquids freeze at 0 °C !");
	     if(temperature == 100) 
			            	System.out.println("All liquids evaporate at 100 °C !");
        }else {
			System.err.println("The temperature can't go beyond say 0..100 °C ");
		}
	}
	public boolean isCold() {
		return temperature <= 18;
	}
	public boolean isWarm() {
		return temperature >= 18 && temperature < 36;
	}
	public boolean isHot() {
		return temperature > 36;
	}
	public String getCategory() {
        return getCategory();
    }

    public String getLevel() {
        return getLevel();
    }
}
