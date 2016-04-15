package gabrail;

public abstract class Beverage {
	String description="unbekannter Beverage";

	public String getDescription() {
		return description;
	}
	public abstract double cost();
		
}
