package org.emp;

import org.project.Project;

public class Employee extends Project {
public void empName() {
System.out.println("employee name is arun");
}
public static void main(String[] args) {
	Employee bb = new Employee();
	bb.projectName();
	bb.projectPeriod();
	bb.empName();
}
}
