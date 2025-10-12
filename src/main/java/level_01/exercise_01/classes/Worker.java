package level_01.exercise_01.classes;

public class Worker {
	private String name;
	private String lastName;
	private int priceHour;

	public Worker(String name, String lastName, int priceHour) {
		this.name = name;
		this.lastName = lastName;
		this.priceHour = priceHour;
	}

	public int getPriceHour() {
		return this.priceHour;
	}

	public int computeSalary(int hours) {
		return this.priceHour * hours;
	}
}
