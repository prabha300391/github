package org.project;

public class Project {
public void projectName() {
System.out.println("project name is xxx");
} void projectPeriod() {
System.out.println(" project period is 6 months");
}
public static void main(String[] args) {
	Project aa = new Project();
	ProjectTime bb = new ProjectTime();
	aa.projectName();
	aa.projectPeriod();
	bb.time();
}
}
