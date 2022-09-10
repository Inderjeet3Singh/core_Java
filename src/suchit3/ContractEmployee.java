package suchit3;

import java.io.*;

class Employee {
    String name;
}

public class ContractEmployee extends Employee{
    int salary;

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ContractEmployee cemp = new ContractEmployee(10000, "sam");
        FileOutputStream fos = new FileOutputStream("c:/serial.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cemp);
        FileInputStream fis = new FileInputStream("c:/serial.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        cemp = (ContractEmployee) ois.readObject();
        System.out.println(cemp);

    }
    ContractEmployee(int salary,String name){
        super.name = name;
        this.salary = salary;

    }
    public String toString(){
        return  super.name +salary;
    }
}


///    o/p----> Runtime error   c:\serial.ser (Access is denied)