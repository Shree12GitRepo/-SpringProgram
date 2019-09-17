package com.nt.Views;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.DTO.SIMDistributorDTO;

public class SIMDistributorPDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<SIMDistributorDTO> liDTO=null;
		liDTO=new ArrayList<SIMDistributorDTO>();
		liDTO=(List<SIMDistributorDTO>) model.get("drliDTOPDF");
		
		//add paragraph to PDF..
		Paragraph p=new Paragraph("PDF Format Of SIMDistributor Details");
		p.setAlignment("center");
		doc.add(p);
		
		//Show as Table Format data in PDF...
		Table table= new Table(4, liDTO.size());
		
		for(SIMDistributorDTO dto:liDTO)
		{
			table.addCell(String.valueOf(dto.getId()));
			table.addCell(dto.getDname());
			table.addCell(dto.getLocation());
			table.addCell(dto.getSimCompany());
		}
		
		//add table to document...
		doc.add(table);

	}

}
