package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public static double netSalary;
	
	public void netSalary() {
		this.netSalary = grossSalary - tax; 
	}
	
	public void increaseSalary(double percentage) {
		grossSalary *= (1 + (percentage / 100));
	}
	
	public String toString() {
		return	name
				+ ", $"
				+ String.format("%.2f", netSalary);
	}
}
