package br.fatec.singleton;

public class Client {
    public static void main(String[] args) {
        Runnable tarefa = () -> {
            Logger logger  = Logger.getInstance();
            logger.log("Mensagem de log.");
        };

        Thread thread1 = new Thread(tarefa, "Thread 1");
        Thread thread2 = new Thread(tarefa, "Thread 2");
        Thread thread3 = new Thread(tarefa, "Thread 3");


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
