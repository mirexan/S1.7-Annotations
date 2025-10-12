package level_01.exercise_02.classes;

public class OnlineWorker2 extends Worker2 {
	private final int INTERNET = 25;
	public OnlineWorker2(String name, String lastName, int priceHour) {
		super(name, lastName, priceHour);
	}
	@Override
	public int computeSalary(int hours) {
		return hours * super.getPriceHour() + INTERNET;
	}
	@Deprecated
	public void deprecatedOnlineWorker(){
		System.out.println("Deprecated Online Worker Method");
	}
}
