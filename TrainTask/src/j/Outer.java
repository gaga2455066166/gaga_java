package j;

public class Outer {
	static String str="Outer";
	static class In{
		String str="In";
		public void show() {
			System.out.println(Outer.str);
			System.out.println(str);
		} 
	}
	
}

//����һ�������ڲ�����࣬�ⲿ���ж���һ����Ϊstr��String�ַ�������ʼ������ֵ
//�����ڲ����ж���,���ⲿ��ͬ��������ͬ���ı����������ڲ����ж���һ���������ֱ��ӡ�ⲿ����ڲ���ı�����