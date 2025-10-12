package level_01.exercise_02.classes;
@SuppressWarnings("deprecation")
public class Application {
	public void start(){
		PresentialWorker2 paquita = new PresentialWorker2("Paquita", "Salas", 17);
		OnlineWorker2 magwi = new OnlineWorker2("Magwi", "Perez", 10);

		paquita.deprecatedPresencialWorker();
		magwi.deprecatedOnlineWorker();
	}
}
