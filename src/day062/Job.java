package day062;

public class Job implements Comparable<Job> {

    private String location;
    private double salary;
    private String companyName;

    public Job(String location, double salary, String companyName) {
        this.location = location;//to the inside of field
        this.salary = salary;///salary=60000;
        this.companyName = companyName;
    }
    public Job(){}

    public double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
//    @Override
//    public int compareTo(Job j) {
//        if (this.getSalary()>j.getSalary()){
//            return 1;
//        }else if (this.getSalary()<j.getSalary()){
//            return -1;
//        }else{
//            return 0;
//        }
//    }




    @Override
//    public int compareTo(Job jobObject) {
//
//        if (this.salary>jobObject.salary){
//            return 1;
//        }else if (this.salary<jobObject.salary){
//            return -1;
//        }else{
//            return 0;
//        }
//    }

    public int compareTo(Job jobObject) {


        if (this.salary>jobObject.salary){
            return 1;
        }else if (this.salary<jobObject.salary){

            return -1;
        }else{
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
