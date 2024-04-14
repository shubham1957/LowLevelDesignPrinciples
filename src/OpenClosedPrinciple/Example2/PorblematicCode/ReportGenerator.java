package OpenClosedPrinciple.Example2.PorblematicCode;

public class ReportGenerator {
    public String generateReport(String reportType){

        if(reportType.equals("PDF")){
            return  "Generating PDF report";
        } else if (reportType.equals("WORD")) {
            return "Generating WORD report";
        }
        return "Report type not supported";
    }
}

// if there is an extension of new reportType then we'll have to change the ReportGenerator class
