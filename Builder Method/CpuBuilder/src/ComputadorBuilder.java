public interface ComputadorBuilder {
    ComputadorBuilder setCpu(String cpu);
    ComputadorBuilder setRam(String ram);
    ComputadorBuilder setArmazenamento(String armazenamento);
    ComputadorBuilder setGpu(String gpu);
    Computador build();
}
