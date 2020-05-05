public class Auto {
	private String type;
	private String brand;
	public String color;

	public Auto(String type, String color, String brand) {
		this.brand = brand;
		this.type = type;
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDetails() {
		return "merk:" + brand + ";type:" + type;
	}
}
