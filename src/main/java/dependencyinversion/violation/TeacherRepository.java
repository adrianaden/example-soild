package dependencyinversion.violation;

public class TeacherRepository {
    private MySqlConnection connection;
    public TeacherRepository(MySqlConnection connection){
        this.connection = connection;
    }
    public void save() {
        connection.insert();
    }
    public void update() {
        connection.update();
    }
}
