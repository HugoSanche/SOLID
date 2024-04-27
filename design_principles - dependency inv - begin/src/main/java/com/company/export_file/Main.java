package com.company.export_file;

public class Main {
    ReportGenerator reportGenerator=new ReportGenerator(new CSVGenerator());
    ReportGenerator reportGenerator1=new ReportGenerator(new PDFGenerator());

}
