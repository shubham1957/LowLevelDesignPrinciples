package OpenClosedPrinciple.Example2.BetterCode;

public class PDFReportGenerator implements ReportGenerator{

    @Override
    public String generate() {
        return "Generating PDF report";
    }
}
