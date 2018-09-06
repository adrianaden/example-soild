package openclosed.violation;

public class Student {
    private String type;

    public Student(String type) {
        this.type = type;
    }

    public void introduce() {
        if ("highSchool".equals(type)) {
            System.out.println("I am an high school student");
        } else if ("underGraduate".equals(type)) {
            System.out.println("I am a under graduate student");
        } else {
            System.out.println("I am a common student");
        }
    }
}
