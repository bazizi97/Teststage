package Suppliers;


import java.util.ArrayList;

public class Supplier {
	private String name;
	private int advitam_grade;
	private double grade_weight;
	private ArrayList<Work> works;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdvitam_grade() {
		return advitam_grade;
	}
	public void setAdvitam_grade(int advitam_grade) {
		this.advitam_grade = advitam_grade;
	}
	public ArrayList<Work> getWorks() {
		return works;
	}
	public void setWorks(ArrayList<Work> works) {
		this.works = works;
	}
	public double getGrade_weight() {
		return grade_weight;
	}
	public void setGrade_weight(double grade_weight) {
		this.grade_weight = grade_weight;
	}
	@Override
	public String toString() {
		return "Supplier [name=" + name + ", advitam_grade=" + advitam_grade + ", grade_weight=" + grade_weight
				+ ", works=" + works + "]";
	}
	public Supplier(String name, int advitam_grade, double grade_weight, ArrayList<Work> works) {
		super();
		this.name = name;
		this.advitam_grade = advitam_grade;
		this.grade_weight = grade_weight;
		this.works = works;
	}
	
	
}
