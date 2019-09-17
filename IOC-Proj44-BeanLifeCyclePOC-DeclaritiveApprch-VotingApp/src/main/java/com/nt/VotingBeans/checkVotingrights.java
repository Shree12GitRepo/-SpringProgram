package com.nt.VotingBeans;

public class checkVotingrights {
	private String name,adrs;
	private byte age;
	//0-param constructor..
	public checkVotingrights() {
		System.out.println("checkVotingrights::0-Param");
	}
	//setters..
	public void setName(String name) {
		this.name = name;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	//Bean LifeCyle(Userdefined init(),destroy())..
	public void check() {
		System.out.println("inti():called");
		if(name==null || age==0 ||name=="")
		{
			System.out.println("Age and Name Should not be Empty");
			return;
		}
		if(age<=18)
		{
			System.out.println("You don't have rights to give vote");
		}
		if(age>=18) {
			System.out.println("You are Eligible for voting");
		}
	}
	
	public void destroy() {
		System.out.println("destroy():called");
		age=0;
		name=null;
	}
	
	@Override
	public String toString() {
		return "checkVotingrights [name=" + name + ", adrs=" + adrs + ", age=" + age + "]";
	}
	
	
	

}
