package com.nt.Event;



import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class performanceEvent implements ApplicationListener {
	private long startTime,endTime;
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("performanceEvent.onApplicationEvent()");
		if(event.toString().contains("Refreshed"))
		{
			startTime=System.currentTimeMillis();
		}
		else {
			endTime=System.currentTimeMillis();
		}
		
		System.out.println("Application Performance "+(endTime-startTime)+"ms");
	}

}
