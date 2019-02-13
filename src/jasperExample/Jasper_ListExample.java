package jasperExample;

import java.util.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;

public class Jasper_ListExample {
	public static void main(String[] args) throws JRException {
	
		String sourceFileName = "F:\\ranjith\\trios\\JasperSoft\\Sample.jrxml";
		JasperReport jasperReport = null;
		
		jasperReport = JasperCompileManager.compileReport(sourceFileName);
		
		List<Record> modelList = new ArrayList<Record>();
		modelList.add(new Record("1","Akshay","IT","akshaysharma@gmail.com"));
		modelList.add(new Record("2","Rahul","IT","rahulgupta@gmail.com")); 
		modelList.add(new Record("3","Dev","IT","dev@gmail.com")); 
		modelList.add(new Record("4","Ankit","IT","ankit@gmail.com")); 
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(modelList);
		Map<String,Object> params = new HashMap<String,Object>();
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
		
		String path = "F:\\ranjith\\trios\\JasperSoft\\Sample.pdf";
		JasperExportManager.exportReportToPdfFile(jasperPrint,path);
		
		
		JRXlsxExporter xlsxExporter = new JRXlsxExporter();
		
		 
		 xlsxExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		 xlsxExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "xxx.xlsx");
		 
		
		
		 
		 xlsxExporter.exportReport();
		 
		 
	}
}
