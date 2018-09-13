package dependencyinversion.violation;

public class Main {
    public static void main(String[] args) {
        MySqlConnection connection = new MySqlConnection();
        StudentRepository studentRepository = new StudentRepository(connection);
        studentRepository.save();
        studentRepository.delete();

        TeacherRepository teacherRepository = new TeacherRepository(connection);
        teacherRepository.save();
        teacherRepository.update();
    }
}
