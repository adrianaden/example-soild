package dependencyinversion.violation;

public class StudentRepository {
    private MySqlConnection connection;
    public StudentRepository(MySqlConnection connection){
        this.connection = connection;
    }
    public void save() {
        connection.insert();
    }
    public void delete() {
        connection.delete();
    }
}
