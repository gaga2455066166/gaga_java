package com.cjl.基础练习;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {
        int compareScore = ((Student) o).getScore();
        return this.getScore() - compareScore;
    }

    @Override
    public String toString() {
        return "Student:" +
                "\tid=" + id
                + "\tname=" + name
                + "\tscore=" + score;
    }
}
