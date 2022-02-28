import java.util.List;

public class Info {
	
	String country;
	List<String> languages;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	public Info(String country, List<String> languages) {
		super();
		this.country = country;
		this.languages = languages;
	}
	
	public Info() {
		super();
	}
	
	@Override
	public String toString() {
		return "Info [country=" + country + ", languages=" + languages + "]";
	}
	
	
}
