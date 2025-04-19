package stream;

import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getEmpAge().equals(e1.getEmpAge())){
            if(e1.getEmpName().equals(e2.getEmpName())){
                return Integer.compare(e1.getEmpId(),e2.getEmpId());
            }
            return e1.getEmpName().compareTo(e2.getEmpName());
        }
        return e1.getEmpAge().compareTo(e2.getEmpAge());
    }
    //sort based on the priority empAge,empName,empId


}
