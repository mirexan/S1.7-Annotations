package level_02.exercise_01.classes;

import java.io.File;
import java.io.FileWriter;


public class Application {
	public void start(){
		String directory = getDirectory();
		Person meme = new Person("memé", 30);
		makeDir(directory);
		jsonSerializer(directory,meme);
	}
	public void makeDir(String directory){
		File dir = new File(directory);
		if(!dir.exists()){
			dir.mkdir();
		}
	}
	public void jsonSerializer(String directory, Person meme) {
	File newFile = new File(directory,"person.json");
		try {
			FileWriter writer = new FileWriter(newFile);
			String jsonContent = convertToJson(meme);
			writer.write(jsonContent);
			writer.close();
		}
		catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}
	public String convertToJson(Person meme){
		return "{\n" +
				"\t\"name\": \"" + meme.getName() + " \",\n" +
				"\t\"age\": \"" + meme.getAge() + "\"\n}";
	}
	public String  getDirectory(){
		SerJson annotation = Person.class.getAnnotation(SerJson.class);
		return annotation.directory();
	}
}
