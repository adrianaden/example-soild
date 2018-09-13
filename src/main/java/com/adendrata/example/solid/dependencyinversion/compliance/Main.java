package dependencyinversion.compliance;

public class Main {
    public static void main(String[] args) {
//        Connection connection = new MySqlConnection();
        Connection connection = new PsqlConnection( );

        StudentRepository studentRepository = new StudentRepository(connection);
        studentRepository.save();
        studentRepository.delete();

        TeacherRepository teacherRepository = new TeacherRepository(connection);
        teacherRepository.save();
        teacherRepository.update();
    }
}
