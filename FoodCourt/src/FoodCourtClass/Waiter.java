package FoodCourtClass;

import java.util.ArrayList;

import FoodCourtInterface.iStaff;

public class Waiter extends User implements iStaff{

	private int staff_id;
	private ArrayList<Order> orders = new ArrayList<>();
	
	public void getOrder(){
		
	}
	
	public void updateOrder(){
		
	}
}
