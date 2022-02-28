import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Question2 {
	
	
	private static Integer getNumberofCountries(List<Info> lista) {
		
		
		return lista.size();
		
	}
	
	private static Info getCountryMostOficialSpeakDe(List<Info> lista){
		
		Integer numberOfLang = 0;
		Info country = new Info();
		Integer count=0;
		while(count < lista.size()) {
			if(lista.get(count).getLanguages().contains("de")) {
				if(numberOfLang < lista.get(count).getLanguages().size()){
					numberOfLang = lista.get(count).getLanguages().size();
					country = lista.get(count);
				}
			}
			count++;
		}
		return country;
		
	}
	
	private static Integer getNumberOfOficialLanguagesSpoken(List<Info> lista){
		
		Integer numberOfLang = 0;
		Integer count=0;
		List<String> listlang = new ArrayList<String>();
		while(count < lista.size()) {
			for(int i=0; i < lista.get(count).getLanguages().size();i++) {
				if(!listlang.contains(lista.get(count).getLanguages().get(i))) {
					numberOfLang ++;
					listlang.add(lista.get(count).getLanguages().get(i));
				}
			}
			
			count++;
		}
		return numberOfLang;
		
	}
	

	public static void main(String[] args) {
		
		
		
		
		
		List<JSONObject> jsonObject;
		//Cria o parse de tratamento
		JSONParser parser = new JSONParser();
		//Variaveis que irao armazenar os dados do arquivo JSON
		List<Info> lista= new ArrayList<Info>();

		try {
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (List<JSONObject>) parser.parse(new FileReader(
					"saida.json"));

			//Salva nas variaveis os dados retirados do arquivo
			
			Integer i=0;
			while(i < jsonObject.size()) {
				lista.add(new Info());
				lista.get(i).setCountry( (String) jsonObject.get(i).get("country"));
				lista.get(i).setLanguages((List<String>) jsonObject.get(i).get("languages"));
				i++;
			}
			
			System.out.println(" Number of countries: " + getNumberofCountries(lista));
			System.out.println(" The country with most official languages spoken: " + getCountryMostOficialSpeakDe(lista));
			System.out.println(" The count of the official languages spoken: " + getNumberOfOficialLanguagesSpoken(lista));
			

		}
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
