package interfacesegregation.violation;

public class UnderGraduateStudent extends Student {

    @Override
    public void introduce() {
        System.out.println("I am a under graduate student");
    }

    @Override
    public void createThesis() {
        // create a thesis
    }
}
