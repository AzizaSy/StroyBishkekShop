package NotControlers;

import java.io.IOException;
import java.sql.SQLException;

public class Cashier extends User{
    public Cashier(int id, String name, Position pos) throws SQLException, IOException, ClassNotFoundException {
        super(id, name, pos);
    }
}

