package com.Pranjal.Day52;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class School {

    public void printStudentInfo(Student s) {
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Grade: " + s.getGrade());
    }

    public static void main(String[] args) {
        Student st = new Student("Pranjal", 95);
        School sch = new School();

        sch.printStudentInfo(st);

    }
}
