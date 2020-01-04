package jasperExample;

import java.util.*;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;

public class JasperHtml {

	public static void main(String[] args) throws JRException {

		//Testing for conflict resolved

		String sourceFileName = "F:\\ranjith\\trios\\JasperSoft\\JasperHtml.jrxml";
		JasperReport jasperReport = null;
		//Editing For Changes conflict
		jasperReport = JasperCompileManager.compileReport(sourceFileName);
		
		Map<String, Object> params = new HashMap<>();
		params.put("htmlCode", "<html>"
				+ "<head>"
				+"<title>Sample of html based report</title>" 
						+ "</head>"
						+ "<body>"
						+ "<h1>This is a sample of html report</h1><br><br>"
						+ "<ol><li>Ordered List<ul><li>This"
						+ "<ul><li>This type of this</li><li>That type of this"
						+ "<ul><li>This type of that type of this</li><li>That type of that type of this</li><li>The other type of that type of this</li></ul>"
						+ "</li><li>The other type of this</li></ul>"
						+ "</li><li>That</li><li>The Other</li></ul>"
						+ "</li><li>Ordered List<ul><li>This<ul>"
						+ "<li>This type of this</li><li>That type of this<ul>"
						+ "<li>This type of that type of this</li><li>That type of that type of this</li><li>The other type of that type of this</li></ul>"
						+ "</li><li>The other type of this</li></ul>"
						+ "</li><li>That</li><li>The Other</li></ul>"
						+ "</li></ol>"
						+ "</body>"
						+ "</html>");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());
		
		String path = "F:\\ranjith\\trios\\JasperSoft\\JasperHtml.pdf";
		JasperExportManager.exportReportToPdfFile(jasperPrint,path);
		
		
		JRXlsxExporter xlsxExporter = new JRXlsxExporter();
		
		 
		 xlsxExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		 xlsxExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "JasperHtml.xlsx");
		 
		
		
		 
		 xlsxExporter.exportReport();
		 
}
}
