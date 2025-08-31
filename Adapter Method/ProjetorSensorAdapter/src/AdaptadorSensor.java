public class AdaptadorSensor implements SensorTemperaturaNovo{
    private SensorTemperaturaAntigo sensorAntigo;

    public AdaptadorSensor(SensorTemperaturaAntigo sensorAntigo) {
        this.sensorAntigo = sensorAntigo;
    }

    @Override
    public double lerTemperatura() {
        double f = sensorAntigo.getTempFahrenheit();
        return (f - 32) * 5 / 9; // Conversão F → C
    }
}
