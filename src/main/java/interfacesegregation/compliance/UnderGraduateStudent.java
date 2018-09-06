package interfacesegregation.compliance;

public class UnderGraduateStudent extends Student implements ThesisAble {

    @Override
    public void introduce() {
        System.out.println("I am a under graduate student");
    }

    public void createThesis() {
        // create a thesis
    }
}
