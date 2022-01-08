package org.student;

import org.department.Department;

public class Student extends Department {

	private void studentName() {
		System.out.println("Student Name:: Aditi Ghosh");
	}

	private void studentDept() {
		System.out.println("Student Department:: CSE");
	}

	private void studentId() {
		System.out.println("Student ID:: 07");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}

}
