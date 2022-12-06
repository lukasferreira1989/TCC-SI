/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.si.tcc.uva.sisedu;

/**
 *
 * @author lferreira
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;




public class Formulario {
	
    public Formulario() {

    }


	
	public void criarForm(Aluno aluno) {
	    try {
	        PDDocument pDDocument = PDDocument.load(new File("./termoadesao_template.pdf"));
	        PDAcroForm pDAcroForm = pDDocument.getDocumentCatalog().getAcroForm();
	        PDField field = pDAcroForm.getField("txtNome");
	       // System.out.println(aluno.getNome());
	        field.setValue(aluno.getNome());
	        field = pDAcroForm.getField("txtCpf");
	      //  System.out.println(aluno.getCpf());
	        field.setValue(Long.toString(aluno.getCpf()));
	        field = pDAcroForm.getField("txtRg");
	      //  System.out.println(aluno.getRg());
	        field.setValue(Long.toString(aluno.getRg()));
	        field = pDAcroForm.getField("txtNomeCurso");
	      //  System.out.println(aluno.getNomecurso());
	        field.setValue(aluno.getNomecurso());
	        String pattern = "dd-MM-yyyy";
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	        String date = simpleDateFormat.format(new Date());
	     //   System.out.println(date);
	        field = pDAcroForm.getField("txtData");
	        field.setValue(date);

	        
	        pDDocument.save("./pdf-adesao-"+ Long.toString(aluno.getCpf()) +"-output.pdf");
	        pDDocument.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}

}

