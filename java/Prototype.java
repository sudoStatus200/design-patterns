package java;

import java.util.ArrayList;
import java.util.List;

class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        this.empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Pankaj");
        empList.add("Raj");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override

    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}

public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();

        Employees empsNew = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Rahul");

        System.out.println("emps lits:" + emps.getEmpList());
        System.out.println("Emps New list" + list);

    }
}
