import java.sql.*;

interface Database {
    void connect();
    void disconnect();
    void execute(String query);
    void beginTransaction();
    void commitTransaction();
    void rollbackTransaction();
}