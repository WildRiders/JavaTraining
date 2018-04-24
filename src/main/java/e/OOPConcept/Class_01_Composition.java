package e.OOPConcept;

public class Class_01_Composition {

}

class Job {

    private String role;
    private double salary;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Job(String role, double salary) {
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Person {

    private String name;
    private Job job;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", job=" + job +
                '}';
    }
}

