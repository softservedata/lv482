public class Task {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee(14, 5, "1", "James");
        employees[1] = new SalariedEmployee(18, 4, "9", "John");
        employees[2] = new SalariedEmployee(16, 8, "3", "Fibi");
        employees[3] = new ContractEmployee(100, "Leon");

        for (Employee e : employees) {
            e.printInfo();
            System.out.println();
        }
    }
}
