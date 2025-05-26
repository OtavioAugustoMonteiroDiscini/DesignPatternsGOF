package br.fatec.singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger iniciado");
    }

    public static synchronized Logger getInstance(){
        if (instance == null){
        instance = new Logger();
        }
        return instance;
    }

    public void log(String msg){
        System.out.println(Thread.currentThread().getName() + " - LOG: " + msg);
    }
}
