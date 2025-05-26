package br.fatec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cliente {
    public static void main(String[] args) {
    DatabaseConnection data = DatabaseConnection.getInstance();


    data.executarConsulta("SELECT * FROM USUARIOS");


    DatabaseConnection data2 = DatabaseConnection.getInstance();
    data2.executarConsulta("UPDATE usuarios SET ativo = 1");

        System.out.println("Mesma instancia ? " + (data == data2));
    }
}