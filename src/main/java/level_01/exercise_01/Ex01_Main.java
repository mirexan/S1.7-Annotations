package level_01.exercise_01;

import level_01.exercise_01.classes.OnlineWorker;
import level_01.exercise_01.classes.PresentialWorker;

public class Ex01_Main {
	public static void main(String[] args) {
		PresentialWorker eusebio = new PresentialWorker("Eusebio", "Sánchez", 13);
		OnlineWorker manolito = new OnlineWorker("Manolito", "Martinez", 13);
		eusebio.setPriceOil(60);
		System.out.println("Presential worker salary is " + eusebio.computeSalary(157)
				+ "\nOnlineWorker2 salary is " + manolito.computeSalary(157));
	}
}
