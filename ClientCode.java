
public class ClientCode {
	private static int rpc=1;//rate per click
	private static int scoreKeeper=50*rpc;
	private static int mostRecentOrbitHeight;
	private static int mostRecentOrbitWidth;

	public static void main(String[] args) {
		System.out.println(getScoreKeeper());
		System.out.println(newPlanet());
		System.out.println(getScoreKeeper());
		System.out.println(newPlanet());
		System.out.println(getScoreKeeper());
	}
	public static int getScoreKeeper() {
		scoreKeeper=50*rpc;
		return scoreKeeper;
	}
	public static int setRpc(int num) {
		rpc += num;
		return num;
	}
	/**
	 * Does everything to set up the addition of a new planet
	 */
	public static String newPlanet() {
		//if planet 1 chosen then do...
		SpaceObject Planet1= new PlanetUno("One", true, 1000.00, new Orbit(mostRecentOrbitHeight+=10,mostRecentOrbitWidth+=10), setRpc(1));
		return Planet1.toString();
	}
}
