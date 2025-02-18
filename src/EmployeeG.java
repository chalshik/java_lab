public class EmployeeG {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullEmployee("Bekzat",78,40000);
        employees[1] = new Contract("Bek",98,40000,17,10);
        for(Employee e:employees){
                e.calculateSalary();
                e.displayEmployeeinfo();
        }
    }
    interface Payable{
        public void calculateSalary();
    }
    abstract public static class Employee{

        double total_salary;
        int id;
        String name;
        double base_salary;
        public abstract void calculateSalary();
        public Employee(String name, int id, double base_salary) {
            this.name = name;
            this.id = id;
            this.base_salary = base_salary;
        }
        public void displayEmployeeinfo(){
            System.out.println(name);
            System.out.println(id);
            System.out.println(total_salary);
        };
    }
    public static class FullEmployee extends Employee implements Payable{
        public FullEmployee(String name, int id, double base_salary) {
            super(name, id, base_salary);
        }

        @Override
        public void calculateSalary() {
            total_salary = base_salary * 1.2;
        }
    }
    public static class Contract extends Employee{
        double hours;
        double salary_rate;
        public Contract(String name, int id, double base_salary,double salary_rate,double hours) {
            super(name, id, base_salary);
            this.salary_rate = salary_rate;
            this.hours = hours;
        }

        @Override
        public void calculateSalary() {
            total_salary = hours*salary_rate;
        }
    }
}
