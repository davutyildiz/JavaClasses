package com.class25_1;
import com.class25.Employee;
public class WaterFallTeam  extends Employee{
	public static void main(String[] args) {
		WaterFallTeam team=new WaterFallTeam();
		team.companyName="Sytanx";
		team.employeeId=102; // accessing protected variablei n different package
	}

}
