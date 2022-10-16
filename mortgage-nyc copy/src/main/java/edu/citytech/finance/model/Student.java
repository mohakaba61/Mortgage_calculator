package edu.citytech.finance.model;

public class Student implements Comparable <Student> {

    private String id;
    private float gpa;

    public Student(String id, float gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", gpa=" + gpa +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        int status = Float.compare(this.gpa, o.gpa);

        return status;
    }
}
