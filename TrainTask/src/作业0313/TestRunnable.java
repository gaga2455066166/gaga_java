package ��ҵ0313;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
		}
	}
	
}
