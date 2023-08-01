package pro.sky.java.coursework;

import java.util.Arrays;

public class EmployeeService {
    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getTotalSalaryMonth(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeMinSalary(Employee[] employees) {
        double min = Double.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalary(Employee[] employees) {
        double max = Double.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double getAverageSalary(Employee[] employees) {
        return getTotalSalaryMonth(employees) / employees.length;
    }

    public static void printSMPEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            printSNPEmployee(employee);
        }
    }

    public static void indexSalary(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (1 + percent / 100));
        }
    }

    public static Employee findEmployeeMinSalaryInDepartment(Employee[] employees, int department) {
        return findEmployeeMinSalary(getEmployeesInDepartment(employees, department));
    }

    public static Employee findEmployeeMaxSalaryInDepartment(Employee[] employees, int department) {
        return findEmployeeMaxSalary(getEmployeesInDepartment(employees, department));
    }

    public static double getAverageSalaryInDepartment(Employee[] employees, int department) {
        return getAverageSalary(getEmployeesInDepartment(employees, department));
    }
    public static void indexSalaryInDepartment(Employee[] employees, double percent, int department) {
        indexSalary(getEmployeesInDepartment(employees, department), percent);
    }

    public static void printEmployeesInDepartment(Employee[] employees, int department) {
        Employee[] employeesDep = getEmployeesInDepartment(employees, department);
        for (Employee employee : employeesDep) {
            printEmployeeIdSurnameNamePatronymic(employee);
        }
    }

    public static void printEmployeeFewSalary(Employee[] employees, double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                printEmployeeIdSurnameNamePatronymic(employee);
            }
        }
    }

    public static void printEmployeeMoreSalary(Employee[] employees, double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                printEmployeeIdSurnameNamePatronymic(employee);
            }
        }
    }

    private static Employee[] getEmployeesInDepartment(Employee[] employees, int department) {
        Employee[] result = new Employee[employees.length];
        int i = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                result[i++] = employee;
            }
        }
        return Arrays.copyOf(result, i);
    }

    private static void printEmployeeIdSurnameNamePatronymic(Employee employee) {
        System.out.printf("id: %s ФИО: %s %s %s Зарплата: %f.2%n", employee.getId(),
                employee.getSurname(), employee.getName(), employee.getPatronymic(),
                employee.getSalary());
    }

    public static void printSNPEmployee(Employee employee) {
        System.out.printf("%s %s %s%n", employee.getSurname(), employee.getName(),
                employee.getPatronymic());
    }
}
