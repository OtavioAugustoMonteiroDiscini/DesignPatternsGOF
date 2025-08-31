public class DiretorMontagem {
    public Computador montarGamer(ComputadorBuilder builder) {
        return builder
                .setCpu("Intel Core i9")
                .setRam("32GB DDR5")
                .setArmazenamento("2TB SSD NVMe")
                .setGpu("NVIDIA RTX 4090")
                .build();
    }
}
