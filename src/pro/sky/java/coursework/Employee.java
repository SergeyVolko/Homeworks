package pro.sky.java.coursework;

public class Employee {
    private static int counterId;
    public static final int FIRST_DEPARTMENT = 1;
    public static final int LAST_DEPARTMENT = 5;
    private int department;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private double salary;

    public Employee(int department, String surname, String name, String patronymic, double salary) {
        if (department < FIRST_DEPARTMENT || department > LAST_DEPARTMENT) {
            throw new IllegalArgumentException("Отдел не входит в заданный диапазон.");
        }
        this.department = department;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
        this.id = counterId++;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        if (department < FIRST_DEPARTMENT || department > LAST_DEPARTMENT) {
            throw new IllegalArgumentException("Отдел не входит в заданный диапазон.");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", salary=" + salary +
                '}';
    }
}
