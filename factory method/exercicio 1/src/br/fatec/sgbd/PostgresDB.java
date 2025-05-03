package br.fatec.sgbd;

public class PostgresDB implements Db{
    @Override
    public void exibirDados() {
        System.out.println("Criando um banco de dados postgres");
    }
}
