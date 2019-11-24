package com.class25;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Create an object of a Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		System.out.println();
		
		System.out.println("----Create an object of a ScrumClass class----");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, Burndown chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily Standup";
		sm.attendScrumMeetings();
		System.out.println();
		
		System.out.println("--- Create an object of  Developer class----");
		Developer dev= new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily Standup";
		dev.attendScrumMeetings();
		dev.employeeId=101;
		//dev.employeeSnn not accessible !
		
		System.out.println("----- Create an object of Tester Class---");
		Tester ts=new Tester();
		ts.salary=105000;
		ts.work();
		ts.getPaid();
		ts.test();
		ts.artifacts="Sprint Backlog";
		ts.ceremonies="Sprint Demo, Planning, Retro, Daily Standup";
		ts.attendScrumMeetings();
		
		System.out.println("---- Create an object of ScrumMaster class----");
		ScrumMaster Smas=new ScrumMaster();
		Smas.salary=150000;
		Smas.work();
		Smas.getPaid();
		Smas.coordianteTeam();
		Smas.artifacts="Sprint Backlog";
		Smas.ceremonies="Sprint Demo, Planning, Retro, Daily Standup";
		Smas.attendScrumMeetings();
		
	}

}
