import java.util.Random;
//Humberto Hernández Trejo
public class Perceptron {
    private double[] pesos;  // Vector de pesos sinápticos
    private double bias;     // Sesgo
    private double learningRate;  // Tasa de aprendizaje

    public Perceptron(int numEntradas, double learningRate) {
        this.learningRate = learningRate;
        this.pesos = new double[numEntradas];
        inicializarPesos();
    }

    private void inicializarPesos() {
        Random rand = new Random();
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = rand.nextDouble() * 2 - 1;  // Valores entre -1 y 1
        }
        bias = rand.nextDouble() * 2 - 1;
    }

    private double funcionActivacion(double suma) {
        return 1 / (1 + Math.exp(-suma));  // Función sigmoide
    }

    public double calcularSalida(double[] entrada) {
        double suma = bias;
        for (int i = 0; i < pesos.length; i++) {
            suma += pesos[i] * entrada[i];
        }
        return funcionActivacion(suma);
    }

    public void entrenar(double[][] entradas, double[] salidas, int epocas) {
        for (int epoca = 0; epoca < epocas; epoca++) {
            for (int i = 0; i < entradas.length; i++) {
                double salidaCalculada = calcularSalida(entradas[i]);
                double error = salidas[i] - salidaCalculada;

                // Ajustar pesos y bias
                for (int j = 0; j < pesos.length; j++) {
                    pesos[j] += learningRate * error * entradas[i][j];
                }
                bias += learningRate * error;

                // Imprimir los cálculos
                System.out.printf("Epoca %d - Entrada: %s - Salida Esperada: %.1f - Salida Calculada: %.4f%n",
                        epoca + 1, java.util.Arrays.toString(entradas[i]), salidas[i], salidaCalculada);
            }
        }
    }

    public void imprimirPesos() {
        System.out.println("Pesos óptimos: " + java.util.Arrays.toString(pesos));
        System.out.println("Bias óptimo: " + bias);
    }
}
