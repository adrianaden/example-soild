package dependencyinversion.violation;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.save();
        studentRepository.delete();


        TeacherRepository teacherRepository = new TeacherRepository();
        teacherRepository.save();
        teacherRepository.update();
    }
}
