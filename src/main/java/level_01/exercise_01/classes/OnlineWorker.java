package level_01.exercise_01.classes;

public class OnlineWorker extends Worker{
	private final int INTERNET = 25;
	public OnlineWorker(String name, String lastName,int priceHour) {
		super(name, lastName, priceHour);
	}
	@Override
	public int computeSalary(int hours) {
		return hours * super.getPriceHour() + INTERNET;
	}
}
