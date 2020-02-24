package 作业0211;

import java.util.Scanner;

public class T5 {
//	public static void main(String[] args) {
//		String aString;
//		Scanner scanner = new Scanner(System.in);
//		aString = scanner.nextLine();
//		int a = aString.indexOf("end");
//		if(a != 0) {
//			aString = aString.substring(0,a);
//		}
//		System.out.println(aString);
//		
//	}
//	
//	public Object[] deleteSubString(String str1,String str2) {
//		StringBuffer stringBuffer  = new StringBuffer(str1);
//		str1.replaceAll(regex, replacement)
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String str1=sc.next();
			if(str1.equals("end"))
				break;
			String str2=sc.next();
			Object[] result = deleteSubString(str1, str2);
			System.out.println("删除字串后："+result[0]);
			System.out.println("删除了" +result[1] + "次");
		}
	}
	public static Object[] deleteSubString(String str1,String str2) {
		StringBuffer sb = new StringBuffer(str1);
		int delCount = 0;
		Object[] obj = new Object[2];
 
		while (true) {
			int index = sb.indexOf(str2);
			if(index == -1) {
				break;
			}
			sb.delete(index, index+str2.length());
			delCount++;			
		}
		if(delCount!=0) {
			obj[0] = sb.toString();
			obj[1] = delCount;
		}else {
			obj[0] = -1;
			obj[1] = -1;
		}
		
		return obj;
	}
}
