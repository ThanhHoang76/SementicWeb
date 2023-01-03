/*
*@author Thanhhoang
 @date  Jan 7, 2022
*/
package com.husc.hoangngocthanh.semanticweb;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;

public class XuatTheoBoBa {
	public static void KetQua() {
		Model model = TaoMoHinhRDF.taoModel();
		RDFDataMgr.write(System.out, model, Lang.NTRIPLES);
	}

	public static void main(String[] args) {
		KetQua();
	}
}
