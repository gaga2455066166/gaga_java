package java客户信息管理系统;

/**
 * 视图
 * 
 * @author 24550
 *
 */
public class CustomerView {
	private CustomerList customers = new CustomerList(10);

//	public CustomerView(CustomerList customerList) {
//		super();
//		this.customerList = customerList;
//		Customer customer = new Customer("chen", '男', 12, "12345678-45", "23456@qq.com");
//	}

	public CustomerView() {
		Customer customer = new Customer("chen", '男', 12, "12345678-45", "23456@qq.com");
		customers.addCustomer(customer);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 显示界面
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("----------客户信息管理软件：----------\n");
			System.out.println("\t1.添加客户");
			System.out.println("\t2.修改客户信息");
			System.out.println("\t3.删除客户");
			System.out.println("\t4.客户信息列表");
			System.out.println("\t5.退出");
			System.out.println("请选择：");
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
				System.out.println("是否确认退出？\tY：N");
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
	 * 1.添加客户的操作
	 */
	private void addNewCustomer() {
		System.out.println("addNewCustomer");
	}

	/**
	 * 2.修改
	 */
	private void modifyCustomer() {
		System.out.println("modifyCustomer");
	}

	/**
	 * 3.删除
	 */
	private void deleteCustomer() {
		System.out.println("deleteCustomer");
	}

	/**
	 * 4.打印所有
	 */
	private void listAllCustomer() {

		int total = customers.getTotal();
		if (total == 0)
			System.out.println("没有客户记录");
		else {
			System.out.println("----------所有客户信息----------");
			System.out.println("编号\t" + "姓名\t" + "性别\t" + "年龄\t" + "电话\t\t" + "邮箱");
			Customer[] customer = customers.getAllCustomer();
			for (int i = 0; i < total; i++) {
				System.out.println((i + 1) + "\t" + customer[i].getName() + "\t" + customer[i].getGender() + "\t"
						+ customer[i].getAge() + "\t" + customer[i].getPhone() + "\t" + customer[i].getEmail());
			}

		}
		System.out.println("----------信息显示完成----------");
	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
