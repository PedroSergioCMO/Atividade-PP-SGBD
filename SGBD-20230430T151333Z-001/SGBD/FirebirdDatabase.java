public class FirebirdDatabase implements Database {
    private String connectionString;
    private String username;
    private String password;

    public FirebirdDatabase(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public void connect() {
        System.out.println("Conectando ao banco de dados Firebird...");
    }

    public void disconnect() {
        System.out.println("Desconectando do banco de dados Firebird...");
    }

    public void execute(String query) {
        System.out.println("Executando a query \"" + query + "\" no banco de dados Firebird...");
    }

    public void beginTransaction() {
        System.out.println("Iniciando transação no banco de dados Firebird...");
    }

    public void commitTransaction() {
        System.out.println("Commitando transação no banco de dados Firebird...");
    }

    public void rollbackTransaction() {
        System.out.println("Fazendo rollback da transação no banco de dados Firebird...");
    }
}
