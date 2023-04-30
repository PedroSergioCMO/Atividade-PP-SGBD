public class DatabaseFactory {
    public static Database createDatabase(int tipoConta) {
        switch (tipoConta) {
            case 1:
                return createSingleUserDatabase();
            case 2:
                return createMultiUserDatabaseWithSingleTransactions();
            case 3:
                return createMultiUserDatabaseWithMultipleTransactions();
            default:
                throw new IllegalArgumentException("Tipo de conta inválido.");
        }
    }

    private static Database createSingleUserDatabase() {
        return new ParadoxDatabase();
    }

    private static Database createMultiUserDatabaseWithSingleTransactions() {
        return new FirebirdDatabase("jdbc:firebirdsql://localhost:3050//path/to/database.fdb", "username", "password");
    }

    private static Database createMultiUserDatabaseWithMultipleTransactions() {
        return new MySQLDatabase();
    }
}
