package java客户信息管理系统;

/**
 * customer的刮玻璃模块
 * 
 * @author 24550
 *
 */
public class CustomerList {
	private Customer[] customers;
	private int total = 0;

	/**
	 * 构造器
	 * 
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	public CustomerList() {
		super();
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 修改指定索引位置的客户信息
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
	 * 添加指定客户
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
	 * 删除指定索引位置上的customer
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
	 * 获取所有customer信息
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
	 * 获取指定索引上的客户
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
	 * 获取客户数量
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}
}
