package ��ҵ0211;

public class T3 {
	public static void main(String[] args) {
		String[] a = new String[] {"010","3223","666","7890987","123123"}; 
		int s=0;
		for(int i=0;i<5;i++) {
			int f=0;
			for(int j = 0,k=a[i].length()-1;j<=k;j++,k--) {
				if(a[i].charAt(j) != a[i].charAt(k))
					f=1;
			}
			if(f==0) {
				s++;
				System.out.println(a[i]+"�ǶԳƵ�");
			}
			else {
				System.out.println( a[i]+"���ǶԳƵ�");
			}
		}
		System.out.println("���жԳƣ�" + s);
	}
}
