package com.nt.editor;

import java.beans.PropertyEditorSupport;

import com.nt.Beans.IntrestAmountDetails;

public class CustomIntrestAmountEditor extends PropertyEditorSupport {
	
	public CustomIntrestAmountEditor() {
		System.out.println("*********CustomIntrestAmountEditor-0-Param********");
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		System.out.println("CustomIntrestAmountEditor.setAsText()");
		
			float pAmt=Float.parseFloat(text.substring(0, text.indexOf(",")));
			float rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
			float time=Float.parseFloat(text.substring(text.lastIndexOf(",")+1, text.length()));
			
		IntrestAmountDetails iad=new IntrestAmountDetails();
		iad.setpAmt(pAmt);
		iad.setRate(rate);
		iad.setTime(time);
		setValue(iad);
	}

}
