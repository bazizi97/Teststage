package Suppliers;

import java.util.ArrayList;

public class SelectSupplier {
	private ArrayList<Supplier> suppliers;

	public SelectSupplier(ArrayList<Supplier> suppliers) {
		super();
		this.suppliers = suppliers;
	}

	public SelectSupplier() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SelectSupplier [suppliers=" + suppliers + "]";
	}

	public ArrayList<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ArrayList<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	private String work(String work_type) {
		double global_grade = 0;
		double grade = 0;
		String name = null;
		for (int i = 0; i < this.suppliers.size(); i++) {
			for (int j = 0; j < this.suppliers.get(i).getWorks().size(); j++) {
				if (this.suppliers.get(i).getWorks().get(j).getType() == work_type) {
					grade = this.suppliers.get(i).getAdvitam_grade() * this.suppliers.get(i).getGrade_weight()
							+ this.suppliers.get(i).getWorks().get(j).getPrice();
					if (grade >= global_grade) {
						global_grade = grade;
						name = this.suppliers.get(i).getName();
					}
				}
			}
		}
		return name;
	}

	private static String work_1(String work_type, ArrayList<Supplier> supp) {
		double global_grade = 0;
		double grade = 0;
		String name = null;
		for (int i = 0; i < supp.size(); i++) {
			for (int j = 0; j < supp.get(i).getWorks().size(); j++) {
				if (supp.get(i).getWorks().get(j).getType() == work_type) {
					grade = supp.get(i).getAdvitam_grade() * supp.get(i).getGrade_weight()
							+ supp.get(i).getWorks().get(j).getPrice();
					if (grade >= global_grade) {
						global_grade = grade;
						name = supp.get(i).getName();
					}
				}
			}
		}
		return name;
	}

	private static int index_of_provider(String provider, ArrayList<Supplier> supp) {
		int index = 0;
		for (int i = 0; i < supp.size(); i++) {
			if (supp.get(i).getName() == provider) {
				index = i;
			}
		}
		return index;
	}

	public ArrayList<String> work_all(String work_type) {
		ArrayList<String> providers = new ArrayList<String>();
		providers.add(work(work_type));
		ArrayList<Supplier> supp = this.suppliers;
		supp.remove(index_of_provider(work(work_type), supp));
		while (work_1(work_type, supp) != null) {
			providers.add(work_1(work_type, supp));
			supp.remove(index_of_provider(work(work_type), supp));
		}
		return providers;

	}

	public ArrayList<Supplier> suppliers_organized() {
		ArrayList<Supplier> supp = new ArrayList<Supplier>();
		for (int i = 0; i < this.suppliers.size(); i++) {
			int a = 0;
			for (int j = i + 1; j < this.suppliers.size(); j++) {
				if (this.suppliers.get(j).getAdvitam_grade() >= this.suppliers.get(i).getAdvitam_grade()) {
					supp.add(this.suppliers.get(j));
					a = 1;
				}
			}
			if (a == 0) {
				supp.add(this.suppliers.get(i));
			}
		}
		return supp;

	}

	public double supplier_grade(String supplier_name, String work_type) {
		double global_grade = 0;
		for (int i = 0; i < this.suppliers.size(); i++) {
			if (this.suppliers.get(i).getName() == supplier_name) {
				for (int j = 0; j < this.suppliers.get(i).getWorks().size(); j++) {
					if (this.suppliers.get(i).getWorks().get(j).getType() == work_type) {
						global_grade = this.suppliers.get(i).getAdvitam_grade()
								* this.suppliers.get(i).getGrade_weight()
								+ this.suppliers.get(i).getWorks().get(j).getPrice();
						break;
					}
				}
				break;
			}
		}
		return global_grade;
	}

}
