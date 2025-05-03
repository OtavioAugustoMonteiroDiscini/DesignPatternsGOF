package br.fatec.cliente;

import br.fatec.factory.OracleDBFactory;
import br.fatec.factory.PostgresDBFactory;
import br.fatec.sgbd.Db;


public class Cliente {
    public static void main(String[] args) {


    OracleDBFactory OF = new OracleDBFactory();
    Db Oracle = OF.criarDb();
    Oracle.exibirDados();

    PostgresDBFactory OFP = new PostgresDBFactory();
    Db Postgres = OFP.criarDb();
    Postgres.exibirDados();


    }
}
