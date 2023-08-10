package tms.com.lessons8;

public class Worker extends Employee {

    public Worker(String name, String surname, int experience) {
        super(name, surname, experience);
    }

    @Override
    public JobTitle getJobTitle() {
        return JobTitle.WORKER;
    }
}
