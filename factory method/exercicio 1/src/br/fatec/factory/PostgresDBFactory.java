package br.fatec.factory;

import br.fatec.sgbd.Db;
import br.fatec.sgbd.PostgresDB;

public class PostgresDBFactory implements DBFactory{
    @Override
    public Db criarDb() {
        return new PostgresDB();
    }
}
