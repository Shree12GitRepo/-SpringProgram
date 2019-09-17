package com.nt.concrtclss;

import com.nt.sgltn.jointAccountAcctnumber;

public class CustA {
	//Need Account Number..
		//create private no param constructor(Perform SingleTon)
		jointAccountAcctnumber accn=jointAccountAcctnumber.getInstance();
		//create parameterized constructor(Breakable SingleTon)
		jointAccountAcctnumber acc=new jointAccountAcctnumber("Hari");
		public void jointAccount()
		{
			//System.out.println("Customer A has joint A/c no: "+accn.acc_No);
			//System.out.println("Customer A has "+accn);
			System.out.println("Customer A has joint A/c no: "+acc.acc_No);
			System.out.println("Customer A has "+acc);
		}
}
