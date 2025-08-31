public class ComputadorBuilderSimples implements ComputadorBuilder{
    private String cpu;
    private String ram;
    private String armazenamento;
    private String gpu;

    @Override
    public ComputadorBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputadorBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputadorBuilder setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    @Override
    public ComputadorBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public Computador build() {
        return new Computador(cpu, ram, armazenamento, gpu);
    }
}
