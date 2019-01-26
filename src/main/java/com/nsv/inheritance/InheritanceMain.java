package com.nsv.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.setName("Naga");
        employee.setSalary(115);

        Contractor contractor = new Contractor();
        contractor.setName("Manohar");
        contractor.setHourlyPay(70);

        System.out.println("Employee Details "+employee.getName()+" "+employee.getSalary());
        System.out.println(employee);
        System.out.println("Contractor Details "+contractor.getName()+" "+contractor.getHourlyPay());
        System.out.println(contractor);
        System.out.println("******************************");
        employee.login();
        System.out.println("******************************");
        contractor.login();

        Employee employee1 = new Employee(120);
        System.out.println(employee1);
        System.out.println("******************************");

        Employee employee2 = new Employee("Shekhar","Kundapur","Dev",125);
        System.out.println(employee2);
        System.out.println("*****polymorphic*****");
        Person p = new Employee();
        change(employee);
        change(contractor);


        System.out.println();
        Person p2 = createEmployee();
    }

    private static void change(Person p) {
        if(p instanceof Employee) {
            ((Employee)p).changeEmployee();
        }else{
            ((Contractor)p).changeContractor();
        }

    }

    public static Person createEmployee(){
        return new Employee();
    }
}
