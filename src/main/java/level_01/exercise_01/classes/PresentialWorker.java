package level_01.exercise_01.classes;

public class PresentialWorker extends Worker{
	private static int priceOil;

	public PresentialWorker(String name, String lastName, int priceHour) {
		super(name,lastName,priceHour);
	}
	public void setPriceOil(int priceOil) {
		PresentialWorker.priceOil = priceOil;
	}
	@Override
	public int computeSalary(int hours) {
		return hours * super.getPriceHour() + priceOil;
	}
}
