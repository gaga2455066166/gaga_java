package javaö������ע��;

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
		
		Season winterSeason = Season.valueOf("Winter");//����objname������ö�ٶ�����ͬ���Ķ���
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
	Spring("����","345"){
		@Override
		public void show() {
			// TODO �Զ����ɵķ������
			System.out.println("this is spring!");
			
		}
	},
	Summer("����","678"){
		@Override
		public void show() {
			// TODO �Զ����ɵķ������
			System.out.println("this is summer");
			
		}
	},
	Autumn("����","91011"){
		@Override
		public void show() {
			// TODO �Զ����ɵķ������
			System.out.println("this is autumn");
			
		}
	},
	Winter("����","1212"){
		@Override
		public void show() {
			// TODO �Զ����ɵķ������
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
