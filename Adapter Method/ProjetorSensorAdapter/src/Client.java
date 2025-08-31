public class Client {
          public static void testarSensor(SensorTemperaturaNovo s) {
            System.out.println("Temperatura (Celsius): " + s.lerTemperatura());
        }

        public static void main(String[] args) {
            // Sensor antigo que retorna Fahrenheit
            SensorTemperaturaAntigo sensorAntigo = new SensorTemperaturaAntigo(98.6);

            // Adaptador para o novo sistema
            SensorTemperaturaNovo adaptado = new AdaptadorSensor(sensorAntigo);

            // Testando
            testarSensor(adaptado);
        }
    }
