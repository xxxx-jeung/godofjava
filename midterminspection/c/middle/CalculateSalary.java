package midterminspection.c.middle;

public class CalculateSalary {
    public static Employee[] employees;
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
        for(Employee e : employees){
            System.out.println(e.getName() + "=" + calculateSalary.getSalaryIncrease(e));
        }
    }

    public void calculateSalaries(){
        employees = new Employee[5];
        employees[0] = new Employee("LeeDaeRi", 1,1000000000L);
        employees[1] = new Employee("KimManager", 2,100000000L);
        employees[2] = new Employee("WhangDesign", 3,70000000L);
        employees[3] = new Employee("ParkArchi", 4,80000000L);
        employees[4] = new Employee("LeeDevelop", 5,60000000L);
    }

    public long getSalaryIncrease(Employee employee){
        long result = 0L;
        EmployeeType[] employeeTypes = EmployeeType.values();

        for(EmployeeType e : employeeTypes){
            if(e.getValue() == employee.getType()){
                double increase = employee.getSalary() * (e.getRate() / 100.0);
                result = employee.getSalary() + (long) increase;
                break;
            }
        }
        return result;
    }
}
