public class SalaryScale {
    public static void main(String[] args) {
        Salary salary1 = new Salary();
        Salary salary2 = new Salary();
        Salary salary3 = new Salary();
        Salary salary4 = new Salary();

        salary1.setEmployeeSalary("Mark",500);
        salary2.setEmployeeSalary("syam",10000);
        salary3.setEmployeeSalary("Mary",4500);
        salary4.setEmployeeSalary("Dayana",2500);

        salary1.calculateScale();
        salary2.calculateScale();
        salary3.calculateScale();
        salary4.calculateScale();

    }
}
class Salary
{
    char EmployeeScale;
    String EmployeeName;
    float EmployeeSalary;

    void setEmployeeSalary(String eN, float eS){
        System.out.println();
        EmployeeName=eN;
        EmployeeSalary=eS;
    }
    void calculateScale() {
        if (EmployeeSalary >= 1 && EmployeeSalary <= 1500)
        EmployeeScale = 'L';

        else if (EmployeeSalary >= 1501 && EmployeeSalary <= 5000)
            EmployeeScale='M';

        else if (EmployeeSalary>=5001)
            EmployeeScale='H';
        {
            System.out.println("Employee name is : " + EmployeeName);
            System.out.println("Employee salaries are : " + EmployeeSalary);
            System.out.println("Employee scale is : " + EmployeeScale);


        }
    }
}
