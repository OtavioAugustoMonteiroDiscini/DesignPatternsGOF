package br.fatec;

public class DatabaseConnection {


    private static final DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection(){
        System.out.println("Conectado ao banco de dados");
    }


    public static DatabaseConnection getInstance(){
        return instance;
    }

    public void executarConsulta(String sql){
        System.out.println("Executando consulta: " + sql);
    }
}
