package level_01.exercise_02.classes;

public class PresentialWorker2 extends Worker2 {
	private static int priceOil;

	public PresentialWorker2(String name, String lastName, int priceHour) {
		super(name,lastName,priceHour);
	}
	public void setPriceOil(int priceOil) {
		PresentialWorker2.priceOil = priceOil;
	}
	@Override
	public int computeSalary(int hours) {
		return hours * super.getPriceHour() + priceOil;
	}
	@Deprecated
	public void deprecatedPresencialWorker(){
		System.out.println("Deprecated Presencial Worker Method");
	}
}
