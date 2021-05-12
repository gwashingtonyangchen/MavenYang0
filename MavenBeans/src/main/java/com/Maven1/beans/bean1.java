package com.Maven1.beans;
import com.Maven1.beans.driver;
public class bean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       driver driver1 =new driver();
       driver driver2 =new driver();
       driver1.setAge(25);
		driver1.setName("Yang");
		driver1.setWeight(200);
		driver2.setAge(30);
		driver2.setName("George");
		driver2.setWeight(300);
		System.out.println(driver1.toString());
		System.out.println(driver2.toString());
       System.out.println("Matt is awesome!");
	}

}
