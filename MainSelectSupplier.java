package Suppliers;

import java.util.ArrayList;

public class MainSelectSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Work work_1 = new Work("embalming",350);
		Work work_2 = new Work("transport_before_casketing",450);
		ArrayList<Work> works_1 = new ArrayList<Work>();
		works_1.add(work_1);
		works_1.add(work_2);
		Supplier supp_1 = new Supplier("FunePlus",3,4.0,works_1);
		Work work_3 = new Work("graving",10);
		ArrayList<Work> works_2 = new ArrayList<Work>();
		works_2.add(work_3);
		Supplier supp_2 = new Supplier("FuneTop",1,5.0,works_2);
		Work work_4 = new Work("embalming",750);
		ArrayList<Work> works_3 = new ArrayList<Work>();
		works_3.add(work_4);
		Supplier supp_3 = new Supplier("FuneTruc",5,10.0,works_3);
		Work work_5 = new Work("digging",350);
		ArrayList<Work> works_4 = new ArrayList<Work>();
		works_4.add(work_5);
		Supplier supp_4 = new Supplier("FuneCorp",2,2.0,works_4);
		ArrayList<Supplier> supp = new ArrayList<Supplier>();
		supp.add(supp_1);
		supp.add(supp_2);
		supp.add(supp_3);
		supp.add(supp_4);
		SelectSupplier suppliers = new SelectSupplier(supp);
		System.out.println(suppliers.suppliers_organized());
		
		
		
	}

}
