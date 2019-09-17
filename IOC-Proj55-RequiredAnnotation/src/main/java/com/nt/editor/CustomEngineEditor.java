package com.nt.editor;

import java.beans.PropertyEditorSupport;

import com.nt.Beans.Engine;

public class CustomEngineEditor extends  PropertyEditorSupport{
	
	public CustomEngineEditor() {
		System.out.println("**********CustomEngineEditor()-0Param************");
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("************setAsText()*********");
		Engine engg=null;
		String engineNumber=text.substring(0, text.indexOf(","));
		String engineCC=text.substring(text.lastIndexOf(",")+1,text.length());
		engg=new Engine();
		//set the property to Object...
		engg.setEnggnumber(engineNumber);
		engg.setEnggCC(engineCC);
		setValue(engg);
	}
	

}
