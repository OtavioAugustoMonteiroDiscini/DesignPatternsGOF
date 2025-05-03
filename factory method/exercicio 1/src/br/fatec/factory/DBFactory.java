package br.fatec.factory;

import br.fatec.sgbd.Db;

public interface DBFactory {
    Db criarDb();
}
