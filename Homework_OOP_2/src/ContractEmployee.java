public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember = "a description of federalTaxIdmember";
    private int emplId;

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public ContractEmployee(int salary, String name) {
        employeeId++;
        this.emplId = getEmployeeId();
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void printInfo(){
        System.out.println("ID: " + this.emplId);
        System.out.println("name: " + this.name);
        System.out.println("salary: " + this.salary);
    }

    @Override
    public int calculatePay() {
        return salary;
    }
}
