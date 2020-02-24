package l;

public class World {
	String yearString;
	String noString;
	String champion;
	public String getYearString() {
		return yearString;
	}
	public void setYearString(String yearString) {
		this.yearString = yearString;
	}
	public String getNoString() {
		return noString;
	}
	public void setNoString(String noString) {
		this.noString = noString;
	}
	public String getChampion() {
		return champion;
	}
	public void setChampion(String champion) {
		this.champion = champion;
	}
	public World(String yearString, String noString, String champion) {
		super();
		this.yearString = yearString;
		this.noString = noString;
		this.champion = champion;
	}
	public World() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}
