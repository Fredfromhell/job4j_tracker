package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        TextReport report2 = new TextReport();
        JSONReport report3 = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        String text2 = report2.generate("Report's name", "Report's body");
        String text3 = report3.generate("Report's name", "Report's body");

        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);
    }
}
