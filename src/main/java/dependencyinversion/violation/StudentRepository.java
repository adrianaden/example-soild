package dependencyinversion.violation;

public class StudentRepository {
    public void save() {
        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.insert();
    }

    public void delete() {
        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.delete();
    }
}
