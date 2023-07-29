package pro.sky.java.coursework;

import java.util.Arrays;

public class Main {
    private static final String DELIMITER = "=".repeat(60);
    private static Employee[] employees = {
            new Employee(1, "Петров", "Петр", "Петрович", 100000),
            new Employee(2, "Иванов", "Иван", "Иванович", 70000),
            new Employee(3, "Сергеев", "Сергей", "Сергеевич", 50000),
            new Employee(3, "Николаев", "Николай", "Николаевич", 50000),
            new Employee(4, "Денисов", "Денис", "Денисович", 30000),
            new Employee(4, "рррррррр", "4рррркама", "ккам", 30000),
            new Employee(5, "амам", "епмеп", "пемее", 10000),
            new Employee(5, "меем", "еепмп", "5епе5е", 3000),
            new Employee(5, "е5м", "п6нрн", "6нр6нрн6", 10000),
            new Employee(5, "4каа", "п6нр7г", "рррр", 12000)
    };

    private static EmployeeBook employeeBook = new EmployeeBook(employees);
    public static void main(String[] args) {
        System.out.println("*".repeat(60));
        System.out.println("Тестируем класс EmployeeService");
        printEmployeesEmployeeService();
        getTotalSalaryMonthEmployeeService();
        findEmployeeMinSalaryEmployeeService();
        findEmployeeMaxSalaryEmployeeService();
        getAverageSalaryEmployeeService();
        printSMPEmployeesEmployeeService();
        indexSalaryEmployeeService();
        findEmployeeMinSalaryInDepartmentEmployeeService(5);
        findEmployeeMaxSalaryInDepartmentEmployeeService(5);
        getAverageSalaryInDepartmentEmployeeService(5);
        indexSalaryInDepartmentEmployeeService(5, 10);
        printEmployeesInDepartmentEmployeeService(5);
        printEmployeeFewSalaryEmployeeService(15000);
        printEmployeeMoreSalaryEmployeeService(15000);
        System.out.println("*".repeat(60));
        System.out.println("Тестируем класс EmployeeBook");
        addEmployee();
        removeEmployee();
        replaceSalaryDepartment();
        printEmployeeByDepartment();
    }

    public static void printEmployeesEmployeeService() {
        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными "
                + "(вывести в консоль значения всех полей (toString)).");
        EmployeeService.printEmployees(employees);
        System.out.println(DELIMITER);
    }

    public static void getTotalSalaryMonthEmployeeService() {
        System.out.println("Посчитать сумму затрат на зарплаты в месяц.");
        System.out.printf("Сумма: %.2f%n", EmployeeService.getTotalSalaryMonth(employees));
        System.out.println(DELIMITER);
    }

    public static void findEmployeeMinSalaryEmployeeService() {
        System.out.println("Найти сотрудника с минимальной зарплатой.");
        System.out.printf("Сотрудник с минимальной зарплатой: %s%n", EmployeeService.findEmployeeMinSalary(employees));
        System.out.println(DELIMITER);
    }

    public static void findEmployeeMaxSalaryEmployeeService() {
        System.out.println("Найти сотрудника с максимальной зарплатой.");
        System.out.printf("Сотрудник с максимальной зарплатой: %s%n", EmployeeService.findEmployeeMaxSalary(employees));
        System.out.println(DELIMITER);
    }

    public static void getAverageSalaryEmployeeService() {
        System.out.println("Подсчитать среднее значение зарплат.");
        System.out.printf("Среднее значение зарплат по всем сотрудникам: %.2f%n",
                EmployeeService.getAverageSalary(employees));
        System.out.println(DELIMITER);
    }

    public static void printSMPEmployeesEmployeeService() {
        System.out.println("Получить Ф. И. О. всех сотрудников (вывести в консоль).");
        EmployeeService.printSMPEmployees(employees);
        System.out.println(DELIMITER);
    }

    public static void indexSalaryEmployeeService() {
        System.out.println("Проиндексировать зарплату на 10 процентов");
        System.out.println("Было:");
        EmployeeService.printEmployees(employees);
        EmployeeService.indexSalary(employees, 10);
        System.out.println("-".repeat(60));
        System.out.println("Стало: ");
        EmployeeService.printEmployees(employees);
        System.out.println(DELIMITER);
    }

    public static void findEmployeeMinSalaryInDepartmentEmployeeService(int department) {
        System.out.printf("Сотрудник с минимальной зарплатой в %d отделе%n", department);
        System.out.println(EmployeeService.findEmployeeMinSalaryInDepartment(employees, department));
        System.out.println(DELIMITER);
    }

    public static void findEmployeeMaxSalaryInDepartmentEmployeeService(int department) {
        System.out.printf("Сотрудник с максимальной зарплатой в %d отделе%n", department);
        System.out.println(EmployeeService.findEmployeeMaxSalaryInDepartment(employees, department));
        System.out.println(DELIMITER);
    }

    public static void getAverageSalaryInDepartmentEmployeeService(int department) {
        System.out.printf("Средняя зарплата по отделу %d%n", department);
        System.out.println(EmployeeService.getAverageSalaryInDepartment(employees, department));
        System.out.println(DELIMITER);
    }

    public static void indexSalaryInDepartmentEmployeeService(int department, double percent) {
        System.out.printf("Проиндексировать зарплату всех сотрудников отдела %d на %f.2 процентов%n",
                department, percent);
        System.out.println("Было:");
        EmployeeService.printEmployees(employees);
        EmployeeService.indexSalaryInDepartment(employees, percent, department);
        System.out.println("Стало:");
        EmployeeService.printEmployees(employees);
        System.out.println(DELIMITER);
    }

    public static void printEmployeesInDepartmentEmployeeService(int department) {
        System.out.printf("Напечатать всех сотрудников %d отдела%n", department);
        EmployeeService.printEmployeesInDepartment(employees, department);
        System.out.println(DELIMITER);
    }

    public static void printEmployeeFewSalaryEmployeeService(double num) {
        System.out.println("Все сотрудники с зарплатой меньше числа " + num);
        EmployeeService.printEmployeeFewSalary(employees, num);
        System.out.println(DELIMITER);
    }

    public static void printEmployeeMoreSalaryEmployeeService(double num) {
        System.out.println("Все сотрудники с зарплатой большей или равной числа " + num);
        EmployeeService.printEmployeeMoreSalary(employees, num);
        System.out.println(DELIMITER);
    }

    public static void addEmployee() {
        System.out.println("Добавление сотрудника.");
        employeeBook.addEmployee(new Employee(5, "aaaa", "aaaa", "aaaa", 10000));
        employeeBook.printEmployees();
        System.out.println(DELIMITER);
    }

    public static void removeEmployee() {
        System.out.println("Удаление сотрудника по id");
        System.out.println(employeeBook.removeEmployee(9));
        employeeBook.printEmployees();
        System.out.println(DELIMITER);
    }

    public static void replaceSalaryDepartment() {
        System.out.println("Изменение зарплаты и отдела у сотрудника по ФИО: aaaa aaaa aaaa");
        employeeBook.replaceSalaryDepartment("aaaa", "aaaa", "aaaa",
                1, 100500d);
        employeeBook.printEmployees();
        System.out.println(DELIMITER);
    }

    public static void printEmployeeByDepartment() {
        System.out.println("Получить Ф. И. О. всех сотрудников по отделам.");
        employeeBook.printEmployeeByDepartment();
        System.out.println(DELIMITER);
    }
}
