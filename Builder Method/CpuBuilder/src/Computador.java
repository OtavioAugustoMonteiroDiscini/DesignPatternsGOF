public class Computador {
    private String cpu;
    private String ram;
    private String armazenamento;
    private String gpu;

    public Computador(String cpu, String ram, String armazenamento, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.armazenamento = armazenamento;
        this.gpu = gpu;
    }

    public void mostrarConfiguracao() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("GPU: " + gpu);
    }
}
