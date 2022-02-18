package labtask4;

public class Student {

    private String name;
    private int Id;
    private double cgpa;

    public void insertRecord(String name, int Id, double cqpa) {
        this.name = name;
        this.Id = Id;
        this.cgpa = cgpa;
    }

    public void displayRecord() {
        System.out.println("Name:" + name);
        System.out.println("Id:" + Id);
        System.out.println("cgpa:" + cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insertRecord("Salman", 14580, 3.50);
        s1.displayRecord();
        Student s2 = new Student();
        s2.insertRecord("Fimu", 14614, 3.70);
        s2.displayRecord();
    }

}
