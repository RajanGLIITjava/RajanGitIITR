package com.greatlearning.departments;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		
		TechDepartment tech = new TechDepartment();
		
		HrDepartment hr = new HrDepartment();
		
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		

	}

}
