package OpenClosedPrinciple.Example2.BetterCode;

public class Main {
    public static void main(String[] args) {
        PdfReportGenerator  pdf = new PdfReportGenerator();
        WordReportGenerator word = new WordReportGenerator();
        System.out.println(pdf.generateReport());
        System.out.println(word.generateReport());
    }
}
