package interfacesegregation.violation;

public class HighSchoolStudent extends Student {
    @Override
    public void introduce() {
        System.out.println("I am an high school student");
    }
}
