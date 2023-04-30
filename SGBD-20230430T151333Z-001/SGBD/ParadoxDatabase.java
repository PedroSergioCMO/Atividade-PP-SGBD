public class ParadoxDatabase implements Database {
    public void connect() {
        System.out.println("Conectando ao banco de dados Paradox...");
    }

    public void disconnect() {
        System.out.println("Desconectando do banco de dados Paradox...");
    }

    public void execute(String query) {
        System.out.println("Executando a query \"" + query + "\" no banco de dados Paradox...");
    }

    public void beginTransaction() {
        System.out.println("Iniciando transação no banco de dados Paradox...");
    }

    public void commitTransaction() {
        System.out.println("Commitando transação no banco de dados Paradox...");
    }

    public void rollbackTransaction() {
        System.out.println("Fazendo rollback da transação no banco de dados Paradox...");
    }
}