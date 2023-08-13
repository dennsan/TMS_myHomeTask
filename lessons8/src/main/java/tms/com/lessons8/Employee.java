package tms.com.lessons8;


public abstract class Employee {

    private String name;
    private String surname;
    private int experience;
    private final int rate = 1500;

    public Employee(String name, String surname, int experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }

    public abstract JobTitle getJobTitle();

    public int calcSalary(JobTitle jobTitle) {
        return rate * jobTitle.getK() * experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void printInfo() {
        String name1 = getName();
        String surname1 = getSurname();
        int salary = calcSalary(getJobTitle());
        System.out.println(name1 + " " + surname1 + " " + salary);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", surname='" + surname + '\'';
    }
}
