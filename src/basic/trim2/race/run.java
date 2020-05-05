
public class run {
	public static void main(String[] args) {
		Auto car = new Auto("Berlingo", "Black", "Citroen");
		System.out.println(car.getColor());
		car.setColor("red");
		System.out.println(car.getColor());
		System.out.println(car.getDetails());
	}
}
