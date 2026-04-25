package org.example.classandobject;

public class NewMain {
    /**
     * Buat object Employee, bebas pake constructor yg mana aja
     * Buat object BugReport, bebas pake constructor yg mana aja
     * Copy object TestCase yang udah ada
     * Buat Object QAEngineer
     * panggil method workSummary() yang ada di class QAEngineer
     * */

    public static void main(String[] args) {
        Employee newEmployee = new Employee();
        TestCase tc1 = new TestCase(
                "TC001",
                "Login Feature",
                "Passed"
        );
        BugReport bugReport = new BugReport(
          "B001",
          "High",
          "25-04-2026",
          "This is a bug report"
        );

        QAEngineer qaEngineer = new QAEngineer(
                "Lead",
                newEmployee,
                tc1,
                bugReport
        );

        qaEngineer.workSummary();


    }
}
