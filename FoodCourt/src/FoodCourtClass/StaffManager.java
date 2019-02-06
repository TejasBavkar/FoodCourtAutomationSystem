package FoodCourtClass;

import java.util.ArrayList;

import FoodCourtInterface.iStaff;
import FoodCourtInterface.iStaffManager;

public class StaffManager extends User implements iStaffManager{

	private int sMan_id;
	private ArrayList<iStaff> staff = new ArrayList<>();
	@Override
	public void updateMenu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void generateSalary() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void markAttendance() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStaffInfo() {
		// TODO Auto-generated method stub
		
	}

}
