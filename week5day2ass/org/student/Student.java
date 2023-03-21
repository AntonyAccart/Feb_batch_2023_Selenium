package org.student;



import org.department.Department;
//student grand children class derived from parent class
public class Student extends Department {
    public void studentName() {
        System.out.println("Student Name:ANTONY");
    }

    public void studentDept() {
        System.out.println("Student Department:MCA");
    }

    public void studentId() {
        System.out.println("Student ID:2");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.collegeName();
        student.collegeCode();
        student.collegeRank();
        student.deptName();
        student.studentName();
        student.studentDept();
        student.studentId();
    }
}
