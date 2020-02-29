package java枚举类与注解;

public class enumTest {

	public static void main(String[] args) {
		Season springSeason = Season.Spring;
		System.out.println(springSeason);
		System.out.println(springSeason.getMonthString());
		System.out.println(springSeason.getSeasonString());
		Season[] seasons = Season.values();
		System.out.println("*********");
		for(int i=0;i<seasons.length;i++) {
			System.out.println(seasons[i]);
		}
		
		Season winterSeason = Season.valueOf("Winter");//根据objname，返回枚举对象中同名的对象
		System.out.println(winterSeason.getSeasonString());
		winterSeason.show();
		winterSeason.show();
		winterSeason.show();
		
		winterSeason.show();
		
		winterSeason.show();
		winterSeason.show();
	}
}
enum Season implements Info{
	Spring("春天","345"){
		@Override
		public void show() {
			// TODO 自动生成的方法存根
			System.out.println("this is spring!");
			
		}
	},
	Summer("夏天","678"){
		@Override
		public void show() {
			// TODO 自动生成的方法存根
			System.out.println("this is summer");
			
		}
	},
	Autumn("秋天","91011"){
		@Override
		public void show() {
			// TODO 自动生成的方法存根
			System.out.println("this is autumn");
			
		}
	},
	Winter("冬天","1212"){
		@Override
		public void show() {
			// TODO 自动生成的方法存根
			System.out.println("this is winter");
			
		}
	};
	
	private final String seasonString;
	private final String monthString;
	private Season(String seasonString0,String monthString0) {
		this.monthString = monthString0;
		this.seasonString = seasonString0;
		
	}
	public String getSeasonString() {
		return seasonString;
	}
	public String getMonthString() {
		return monthString;
	}
	
	
	
}
interface Info{
	void show();
}
