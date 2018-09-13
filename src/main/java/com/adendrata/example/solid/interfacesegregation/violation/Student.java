package interfacesegregation.violation;

public class Student implements Study {

    public void introduce() {
        System.out.println("I am a common student");
    }

    public void createPaper() {
        // create a paper
    }

    public void createThesis() {
        throw new IllegalStateException("not implement yet");
    }
}
