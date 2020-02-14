public class SalariedEmployee extends Employee implements Payment {
    private int hourlyRate;
    private int workHours;
    private int emplID;
    private String socialSecurityNumber;

    public SalariedEmployee(int hourlyRate, int workHours, String socialSecurityNumber, String name) {
        employeeId++;
        this.emplID = getEmployeeId();
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    @Override
    public void printInfo(){
        System.out.println("ID: " + this.emplID);
        System.out.println("name: " + this.name);
        System.out.println("hourly rate: " + this.hourlyRate);
        System.out.println("work hours: " + workHours);
        System.out.println("social Security Number: " + this.socialSecurityNumber);
        calculatePay();
        System.out.println("salary: " + this.salary);
    }

    @Override
    public int calculatePay() {
        this.salary = this.hourlyRate * this.workHours;
        return salary;
    }
}
