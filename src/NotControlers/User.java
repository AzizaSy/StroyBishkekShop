package NotControlers;
import java.io.IOException;
import java.sql.SQLException;

public abstract class User extends TransactionWorker{
    private int Id;
    private String Name;
    Position position;

    public User(int id, String name, Position pos) throws SQLException, IOException, ClassNotFoundException {
        this.Id = id;
        this.Name = name;
        this.position=pos;
        createAllTransactions();
        createAllMaterials();
        createAllSuppliers();
    }
}

