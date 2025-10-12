package level_01.exercise_02.classes;

public class Worker2 {
	private String name;
	private String lastName;
	private int priceHour;

	public Worker2(String name, String lastName, int priceHour) {
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
