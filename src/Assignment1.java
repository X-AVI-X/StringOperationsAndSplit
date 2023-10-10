import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment1 {

    public static void main(String[] args) {
        String data = "John:30:HR:50000,Alice:28:Finance:60000,Bob:35:Engineering:75000,Emily:32:HR:55000";
        String[] refinedDataByEmployee = data.split(",");
        int numberOfEmployees = refinedDataByEmployee.length;
        int totalAge=0;
        int highestSalary=Integer.MIN_VALUE;
        float averageAge=0;

        StringBuilder highestSalaryEmployee= new StringBuilder();
        List<String> sortedNames = new ArrayList<>();

        for (String employee: refinedDataByEmployee){
            String[] employeeDetails = employee.split(":");
            totalAge += Integer.parseInt(employeeDetails[1]);

            if(Integer.parseInt(employeeDetails[3])>highestSalary){
                highestSalaryEmployee.replace(0, highestSalaryEmployee.length(), employeeDetails[0]);
                highestSalary=Integer.parseInt(employeeDetails[3]);
            }
            sortedNames.add(employeeDetails[0]);
        }
        averageAge=(float)totalAge/numberOfEmployees;

        System.out.println("Total Employees: "+numberOfEmployees);
        System.out.println("Average age: "+averageAge);
        System.out.println("Employee with Highest Salary: "+highestSalaryEmployee);

        Collections.sort(sortedNames);
        StringBuilder employeeNamesSorted = new StringBuilder();
        for(String name: sortedNames){
            employeeNamesSorted.append(name);
            employeeNamesSorted.append(",");
        }
        employeeNamesSorted.deleteCharAt(employeeNamesSorted.length()-1);
        System.out.println("Sorted Names: "+employeeNamesSorted);

    }
}