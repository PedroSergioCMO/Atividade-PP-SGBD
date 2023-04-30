public class Main {
    public static void main(String[] args) {
        // Testando com perfil Gratuito
        System.out.println("Perfil Gratuito:");
        Database databaseGratuito = DatabaseFactory.createDatabase(1);
        databaseGratuito.connect();
        databaseGratuito.execute("SELECT * FROM clientes");
        databaseGratuito.disconnect();

        // Testando com perfil Básico
        System.out.println("Perfil Básico:");
        Database databaseBasico = DatabaseFactory.createDatabase(2);
        databaseBasico.connect();
        databaseBasico.beginTransaction();
        databaseBasico.execute("INSERT INTO clientes (nome, email, status) VALUES ('João', 'joao@example.com', 'ativo')");
        databaseBasico.execute("UPDATE clientes SET status = 'inativo' WHERE nome = 'Maria'");
        databaseBasico.rollbackTransaction();
        databaseBasico.execute("SELECT * FROM clientes WHERE status = 'ativo'");
        databaseBasico.disconnect();

        // Testando com perfil Ultimate
        System.out.println("Perfil Ultimate:");
        Database databaseUltimate = DatabaseFactory.createDatabase(3);
        databaseUltimate.connect();
        databaseUltimate.beginTransaction();
        databaseUltimate.execute("INSERT INTO clientes (nome, email, status) VALUES ('João', 'joao@example.com', 'ativo')");
        databaseUltimate.execute("UPDATE clientes SET status = 'inativo' WHERE nome = 'Maria'");
        databaseUltimate.commitTransaction();
        databaseUltimate.execute("SELECT * FROM clientes WHERE status = 'ativo' ORDER BY nome");
        databaseUltimate.disconnect();
    }
}
