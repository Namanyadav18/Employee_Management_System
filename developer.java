public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int employeeId, String name, double salary, String programmingLanguage) {
        super(employeeId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
