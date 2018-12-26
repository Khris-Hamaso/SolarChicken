public class SpaceObject {
	private String name;
	private Boolean iOrbit;
	private double price;
	public SpaceObject(String name, Boolean iOrbit, double price) {
		this.name=name;
		this.iOrbit=iOrbit;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getOrbit() {
		return iOrbit;
	}
	public void setOrbit(Boolean iOrbit) {
		this.iOrbit = iOrbit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private void DoOrbit() {
		//FOLLOW iOrbit path using Android Graphics
	}
	private void Destroy() {
		//VISIBLE = TRUE?
	}

}
