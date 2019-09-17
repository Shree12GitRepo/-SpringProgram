package com.nt.VotingBeans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
//@Named("cvr")
//@Configuration
@Component("cvr")
@PropertySource(value="com/nt/resourcess/voting.details",ignoreResourceNotFound=true)
public class checkVotingrights {
	@Value("${vote.name}")
	private String name;
	@Value("${vote.adrs}")
	private String adrs;
	@Value("${vote.age}")
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
	@PostConstruct
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
	@PreDestroy
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
