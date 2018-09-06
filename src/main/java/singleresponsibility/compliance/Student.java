package singleresponsibility.compliance;

public class Student {

    private String name;
    private String address;
    private Integer[] scores;
    private Grade grade;

    public Student(String name, String address, Integer[] scores) {
        this.name = name;
        this.address = address;
        this.scores = scores;
        this.grade = new Grade(scores);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer[] getScores() {
        return scores;
    }

    public void setScores(Integer[] scores) {
        this.scores = scores;
    }
}
