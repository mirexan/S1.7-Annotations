package level_01.exercise_02;

import level_01.exercise_02.classes.Application;

/*Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca des
d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser obsolets.*/
public class Ex02_Main{
	public static void main(String[] args) {
		Application app = new Application();
		app.start();
	}
}
