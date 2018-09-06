package singleresponsibility.compliance;

public class Grade {
    private String name;

    public Grade(Integer[] scores) {
        this.name = calculateGrade(scores);
    }

    private String calculateGrade(Integer[] scores) {

        Double avg = Util.calculateAverage(scores);
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

    @Override
    public String toString() {
        return name;
    }
}
