package dependencyinversion.compliance;

public class StudentRepository {
    private Connection connection;

    public StudentRepository(Connection connection) {
        this.connection = connection;
    }

    public void save() {
        this.connection.insert();
    }

    public void delete() {
        this.connection.delete();
    }
}
