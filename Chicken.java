import java.awt.Shape;
import java.awt.color.*;

public class Planet {
	private double radius;
	private double angle = 0;
	private double distance;
	private double speed;
	// create the Planet object
	public Planet(double r, double d, double speed) {
		radius = r;
		distance = d;
		this.speed = speed;
	}
	//makePlanet function that will... well... make a planet
	public void makePlanetsUno(int numPlanets) {
		Planet[] uno =  new Planet[numPlanets];
		//here we will need to make a condition to show the planets depending on how many the player has bought
		/* if(user.buys Planet[0])
		 * show.Planet[0];
		 * if(user.buys Planet[1];
		 * show.Planet[1];
		 * 
		 * so on and so forth. Maybe it would be better to use a switch with cases?
		 */
		}
	public void makePlanetDos(int total) {
		Planet[] dos = new Planet[total];
		//Similarly, we would have to add some code to create the planet's with their specifc properties 
		//Do you think we should create the properties of each planet, then assign it
		//to a specific place in the array?
		
	}
	public void makePlanetTres(int var) {
		Planet[] tres = new Planet[var];
		//Same thing here, but with different planet properties
	}
	//tried to show the planets with a generic color
	public void Show() {
		//fill(255);
		//ellipse(0,0,0);
	}
	public void orbit() {
		angle = angle + speed; //make the planet orbit
	}
	public int score() {
		int score = 0;
		return score;
	}
	/*public boolean keyPressed() {
		boolean keyPressed = true;
		return keyPressed;
	}*/
public static void main(String[] args) {
	Planet sun = new Planet(10, 0, 0); //starting star
	sun.Show();
	//if(keyPressed == true) {
		//score += 10;
	}
}
