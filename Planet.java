
public class Planet extends SpaceObject{
	private Orbit path;
	private int rateIncrease;
	public PlanetUno(String name, Boolean iOrbit, double price, Orbit path, int rateIncrease){
		super(name, iOrbit, price);
		this.path=path;
		this.rateIncrease=rateIncrease;
	}
	public int getRateIncrease() {
		return rateIncrease;
	}
	public Orbit getMyPath() {
		return path;
	}
	public void setMyOrbit(Orbit path) {
		this.path = path;
	}
	public String toString() {
		return String.format("Type: Planet\nName:%s\nOrbit:%s\nOrbit Details:\n%s\nPrice:%s\nRate Increase:%s", super.getName(), super.getOrbit(),getMyPath().toString(),super.getPrice(),getRateIncrease());
	}
}
