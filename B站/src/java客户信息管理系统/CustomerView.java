package java�ͻ���Ϣ����ϵͳ;

/**
 * ��ͼ
 * 
 * @author 24550
 *
 */
public class CustomerView {
	private CustomerList customers = new CustomerList(10);

//	public CustomerView(CustomerList customerList) {
//		super();
//		this.customerList = customerList;
//		Customer customer = new Customer("chen", '��', 12, "12345678-45", "23456@qq.com");
//	}

	public CustomerView() {
		Customer customer = new Customer("chen", '��', 12, "12345678-45", "23456@qq.com");
		customers.addCustomer(customer);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * ��ʾ����
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("----------�ͻ���Ϣ���������----------\n");
			System.out.println("\t1.��ӿͻ�");
			System.out.println("\t2.�޸Ŀͻ���Ϣ");
			System.out.println("\t3.ɾ���ͻ�");
			System.out.println("\t4.�ͻ���Ϣ�б�");
			System.out.println("\t5.�˳�");
			System.out.println("��ѡ��");
			char menu = CustomerUtil.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				System.out.println("�Ƿ�ȷ���˳���\tY��N");
				char isExit = CustomerUtil.readConfirmSelection();
				if (isExit == 'y' || isExit == 'Y')
					isFlag = false;
				if (isExit == 'n' || isExit == 'N')
					isFlag = true;
				break;
			}
		}

	}

	/**
	 * 1.��ӿͻ��Ĳ���
	 */
	private void addNewCustomer() {
		System.out.println("addNewCustomer");
	}

	/**
	 * 2.�޸�
	 */
	private void modifyCustomer() {
		System.out.println("modifyCustomer");
	}

	/**
	 * 3.ɾ��
	 */
	private void deleteCustomer() {
		System.out.println("deleteCustomer");
	}

	/**
	 * 4.��ӡ����
	 */
	private void listAllCustomer() {

		int total = customers.getTotal();
		if (total == 0)
			System.out.println("û�пͻ���¼");
		else {
			System.out.println("----------���пͻ���Ϣ----------");
			System.out.println("���\t" + "����\t" + "�Ա�\t" + "����\t" + "�绰\t\t" + "����");
			Customer[] customer = customers.getAllCustomer();
			for (int i = 0; i < total; i++) {
				System.out.println((i + 1) + "\t" + customer[i].getName() + "\t" + customer[i].getGender() + "\t"
						+ customer[i].getAge() + "\t" + customer[i].getPhone() + "\t" + customer[i].getEmail());
			}

		}
		System.out.println("----------��Ϣ��ʾ���----------");
	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
