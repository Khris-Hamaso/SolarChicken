
public class Orbit {
	private int height;
	private int width;

	public Orbit(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String toString() {
		return String.format("Height:%s\nWidth:%s", getHeight(), getWidth());
	}
}
