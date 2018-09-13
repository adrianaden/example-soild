package interfacesegregation.compliance;

public class Student implements PaperAble {

    public void introduce() {
        System.out.println("I am a common student");
    }

    public void createPaper() {
        // create a paper
    }
}
