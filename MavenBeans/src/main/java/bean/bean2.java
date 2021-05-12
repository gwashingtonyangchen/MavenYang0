package bean;

import bean.driver;
public class bean2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver driver1 = new driver();
		driver driver2 = new driver();
		driver1.setAge("Red");
		driver1.setName("Yang");
		driver1.setWeight(200);
		driver2.setAge("Green");
		driver2.setName("George");
		driver2.setWeight(300);
		System.out.println(driver1.toString());
		System.out.println(driver2.toString());
		System.out.println("My instructor is awesome!");
	}

}
