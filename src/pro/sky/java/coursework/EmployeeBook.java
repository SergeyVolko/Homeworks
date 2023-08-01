package pro.sky.java.coursework;

import java.util.Arrays;

public class EmployeeBook {
    private static final int CAPACITY = 10;
    private int size;
    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[CAPACITY];
    }

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
        size = employees.length;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("В метод значения null передавать нельзя.");
        }
        if (size == employees.length) {
            employees = Arrays.copyOf(employees, employees.length + CAPACITY);
        }
        employees[size++] = employee;
    }

    public boolean removeEmployee(int id) {
        int index = findIndexById(id);
        if (index < 0) {
            return false;
        }
        System.arraycopy(employees, index + 1, employees, index, size - index - 1);
        employees[size--] = null;
        return true;
    }
    public boolean replaceSalaryDepartment(String surname, String name, String patronymic,
                                           Integer newDepartment, Double newSalary) {
        boolean isReplace = false;
        for (int i = 0; i < size; i++) {
            if (surname.equals(employees[i].getSurname())
                    && name.equals(employees[i].getName())
                    && patronymic.equals(employees[i].getPatronymic())) {
                if (newDepartment != null) {
                    employees[i].setDepartment(newDepartment);
                    isReplace = true;
                }
                if (newSalary != null) {
                    employees[i].setSalary(newSalary);
                    isReplace = true;
                }
            }
        }
        return isReplace;
    }
    
    public void printEmployeeByDepartment() {
        Employee[][] emp = new Employee[Employee.LAST_DEPARTMENT][size];
        int[] positions = new int[Employee.LAST_DEPARTMENT];
        for (int i  = 0; i < size; i++) {
            int department = employees[i].getDepartment() - 1;
            emp[department][positions[department]++] = employees[i];
        }
        for (int i = 0; i < emp.length; i++) {
            System.out.printf("Департамент № %d:%n", i + 1);
            for (int j = 0; j < emp[i].length; j++) {
                if (emp[i][j] == null) {
                    break;
                }
                EmployeeService.printSNPEmployee(emp[i][j]);
            }
            System.out.println("------------------------------");
        }
    }
    private int findIndexById(int id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void printEmployees() {
        EmployeeService.printEmployees(getEmployees());
    }

    public double getTotalSalaryMonth() {
       return EmployeeService.getTotalSalaryMonth(getEmployees());
    }

    public Employee findEmployeeMinSalary() {
        return EmployeeService.findEmployeeMinSalary(getEmployees());
    }

    public Employee findEmployeeMaxSalary() {
        return EmployeeService.findEmployeeMaxSalary(getEmployees());
    }

    public double getAverageSalary() {
        return EmployeeService.getAverageSalary(getEmployees());
    }

    public void printNamesEmployees() {
        EmployeeService.printSMPEmployees(getEmployees());
    }

    public void indexSalary(double percent) {
        EmployeeService.indexSalary(getEmployees(), percent);
    }

    public Employee findEmployeeMinSalaryInDepartment(int department) {
        return EmployeeService.findEmployeeMinSalaryInDepartment(getEmployees(), department);
    }

    public Employee findEmployeeMaxSalaryInDepartment(int department) {
        return EmployeeService.findEmployeeMaxSalaryInDepartment(getEmployees(), department);
    }

    public void printEmployeesInDepartment(int department) {
        EmployeeService.printEmployeesInDepartment(getEmployees(), department);
    }

    public void printEmployeeFewSalary(double salary) {
        EmployeeService.printEmployeeFewSalary(getEmployees(), salary);
    }

    public void printEmployeeMoreSalary(double salary) {
        EmployeeService.printEmployeeMoreSalary(getEmployees(), salary);
    }

    private Employee[] getEmployees() {
        return Arrays.copyOf(employees, size);
    }
}
