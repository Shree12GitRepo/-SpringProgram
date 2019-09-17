package com.nt.sgltn;

public class jointAccountAcctnumber {
	public final long acc_No=1239807l;
	public static jointAccountAcctnumber INSTANCE;
	private jointAccountAcctnumber()
	{
		//no op
	}
	public jointAccountAcctnumber(String s)
	{
		System.out.println("jointAccountAcctnumber::1-param");
	}
	public static jointAccountAcctnumber getInstance()
	{
		if(INSTANCE==null)
		{
			INSTANCE=new jointAccountAcctnumber();
		}
		return INSTANCE;
	}
}
