package pack3;

import java.text.NumberFormat;
import java.util.Locale;

public class Report {
    public void generateReport(Employee[] employees,int size)
    {
        for(int i = 0; i<size; i++)
        {
            System.out.print("Salary of " + (i+1) + " Employee = ");
            System.out.printf("%15.2f",employees[i].getSalary());
            System.out.println(" " + "Rubles");
            System.out.println();
        }
    }
}
