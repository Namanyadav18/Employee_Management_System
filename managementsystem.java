import java.util.Scanner;

public class ManagementSystem {
    static Employee[] employees = new Employee[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Display Employee Details");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String mname = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double msalary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    employees[count++] = new Manager(mid, mname, msalary, dept);
                    System.out.println("Manager added successfully.");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double dsalary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Programming Language: ");
                    String lang = sc.nextLine();
                    employees[count++] = new Developer(did, dname, dsalary, lang);
                    System.out.println("Developer added successfully.");
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (employees[i].getEmployeeId() == searchId) {
                            employees[i].displayDetails();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    for (int i = 0; i < count; i++) {
                        employees[i].displayDetails();
                        System.out.println("-------------------");
                    }
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
