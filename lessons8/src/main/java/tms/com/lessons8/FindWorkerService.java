package tms.com.lessons8;

public class FindWorkerService {

    private boolean find = false;

    public boolean findWorkerService(Director director, String name) {
        Employee[] employees = director.getEmployees();
        for (Employee employee : employees) {

            if (employee.getName().equals(name)) {
                return find = true;
            }
        }

        for (Employee employee : employees) {
            if (employee.getJobTitle() == JobTitle.DIRECTOR) {
                findWorkerService((Director) employee, name);

            }
        }
        return find;
    }
}
