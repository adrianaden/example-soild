package dependencyinversion.compliance;

public class TeacherRepository {
    private Connection connection;

    public TeacherRepository(Connection connection) {
        this.connection = connection;
    }

    public void save() {
        this.connection.insert();
    }

    public void update() {
        this.connection.update();
    }
}
