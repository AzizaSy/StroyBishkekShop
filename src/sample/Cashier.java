package sample;

import java.io.IOException;
import java.sql.SQLException;

public class Cashier extends TransactionWorker {
    protected int Id;
    protected String Name;
    protected Position position;
    public Cashier(int dbId, String dbName,Position pos) throws SQLException, IOException, ClassNotFoundException {
        this.Id = dbId;
        this.Name=dbName;
        this.position=pos;
        createAllTransactions();
        createAllMaterials();
        createAllSuppliers();
    }
}
enum Position{
    ADMINISTRATOR,
    CASHIER
}
