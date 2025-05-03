package br.fatec.factory;

import br.fatec.sgbd.Db;
import br.fatec.sgbd.OracleDB;

public class OracleDBFactory implements DBFactory{
    @Override
    public Db criarDb() {
        return new OracleDB();
    }
}
