package dependencyinversion.violation;

public class TeacherRepository {
    public void save() {
        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.insert();
    }

    public void update() {
        MySqlConnection mySqlConnection = new MySqlConnection();
        mySqlConnection.update();
    }
}
