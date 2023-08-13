package tms.com.lessons8;

import java.util.Arrays;

public class Director extends Employee {
    Employee[] employees = new Employee[]{};

    private int count;

    public Director(String name, String surname, int experience) {
        super(name, surname, experience);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public JobTitle getJobTitle() {
        return JobTitle.DIRECTOR;
    }

    private int size;

    public void getSize() {
        if (size == employees.length) {
            size++;
            employees = Arrays.copyOf(employees, size);
        }
    }

    public void addWorker(Employee employee) {
        getSize();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                count++;
            }
        }
    }


    @Override
    public int calcSalary(JobTitle jobTitle) {
        if (count == 0) {
            count = 1;
            return count * super.calcSalary(jobTitle);
        } else {
            return count * super.calcSalary(jobTitle);
        }
    }

    @Override
    public String toString() {
        return "Director " + getSurname() + " " + getName() +
                " employees: " + Arrays.toString(employees) + "\n";
    }
}
