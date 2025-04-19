package stream;


public class Employee {
    private int empId;
    private String empName;
    private String empAge;

    public Employee() {
    }
    public Employee(int empId, String empName, String empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAge() {
        return empAge;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }


}
