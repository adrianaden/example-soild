package singleresponsibility.violation;

public class Student {
    private String name;
    private String address;
    private Integer[] scores;
    private String grade;

    public Student(String name, String address, Integer[] scores) {
        this.name = name;
        this.address = address;
        this.scores = scores;
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

    public String getGrade() {
        Double avg = calculateAverage(scores);
        if (avg >= 80) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    private Double calculateAverage(Integer[] values) {
        Integer sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        Double avg = (double) (sum / values.length);
        return avg;
    }

}
