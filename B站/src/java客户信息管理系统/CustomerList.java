package java�ͻ���Ϣ����ϵͳ;

/**
 * customer�Ĺβ���ģ��
 * 
 * @author 24550
 *
 */
public class CustomerList {
	private Customer[] customers;
	private int total = 0;

	/**
	 * ������
	 * 
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	public CustomerList() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * �޸�ָ������λ�õĿͻ���Ϣ
	 * 
	 * @param index
	 * @param customer
	 * @return
	 */
	public boolean repaceCustomer(int index, Customer customer) {
		if (index < 0 || index >= total)
			return false;
		else {
			customers[index] = customer;
			return true;
		}
	}

	/**
	 * ���ָ���ͻ�
	 * 
	 * @param customer
	 * @return
	 */
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length)
			return false;
		else {
			customers[total] = customer;
			total++;
			return true;
		}

	}

	/**
	 * ɾ��ָ������λ���ϵ�customer
	 * 
	 * @param index
	 * @return
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total)
			return false;
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}
		customers[total - 1] = null;
		total--;
		return true;

	}

	/**
	 * ��ȡ����customer��Ϣ
	 * 
	 * @return
	 */
	public Customer[] getAllCustomer() {
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}

	/**
	 * ��ȡָ�������ϵĿͻ�
	 * 
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index) {
		if (index < 0 || index >= total)
			return null;
		return customers[index];
	}

	/**
	 * ��ȡ�ͻ�����
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}
}
