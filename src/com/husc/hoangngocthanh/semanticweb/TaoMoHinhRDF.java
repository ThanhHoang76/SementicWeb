/*
*@author Thanhhoang
 @date  Jan 7, 2023
*/
package com.husc.hoangngocthanh.semanticweb;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.SKOS;
import org.apache.jena.vocabulary.VCARD;

public class TaoMoHinhRDF {
	public static Model taoModel() {
		// tạo một Model rỗng
		Model model = ModelFactory.createDefaultModel();
		// set các namespace
		model.setNsPrefix("foaf", FOAF.getURI());
		model.setNsPrefix("dc", DC.getURI());
		model.setNsPrefix("skos", SKOS.getURI());
		model.setNsPrefix("vcard", VCARD.getURI());
		// tạo tài nguyên
		Resource subject = model.createResource("https://www.w3.org/Home/QuanLyKhoaLuan");
		// Bổ sung thuộc tính
		subject.addProperty(DC.creator, "https://www.w3.org/Home/Student");
		Resource subject1 = model.createResource("https://www.w3.org/Home/Student");
		subject1.addProperty(FOAF.name, "HoangNgocTHanh");
		subject1.addProperty(FOAF.name, "PGS. Ts HoangHuuHanh");
		subject1.addProperty(DC.subject, "XayDungUngDungQuanLyKhoaLuan");
		subject1.addProperty(VCARD.UID, "102");
		subject1.addProperty(DC.date, "7/1/2023");
		subject1.addProperty(VCARD.CLASS, "E2");
		subject1.addProperty(VCARD.EMAIL, "thanhhoangit76@gmail.com");
		return model;
	}

	public static void main(String[] args) {
		Model model = taoModel();
		model.write(System.out);
	}
}
