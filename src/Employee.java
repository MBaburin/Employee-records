public class Employee extends Person {

    private String department;
    private String job_title;
    private String certificate_number;

    public String getDepartment() {
        return department;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getCertificate_number() {
        return certificate_number;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setCertificate_number(String certificate_number) {
        this.certificate_number = certificate_number;
    }

    @Override
    public void info() {
        System.out.printf("Id: %d Name: %s Age: %d", getId(), getName(), getAge());
        System.out.println(" ");
        System.out.printf("Department: %s Job title: %s Certificate number: %s", getDepartment(), getJob_title(), getCertificate_number());
    }

    public void changeDepartment(String department) {
        this.department = department;
    }
    public void changeJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void changeCertificate_number(String certificate_number) {
        this.certificate_number = certificate_number;
    }
}




//public void changeAge(int age){
        //this.age =age;


