//Humberto Hernández Trejo
public class Main {
    public static void main(String[] args) {
        // Entrenar Perceptrón SIN SESGO para compuerta AND
        System.out.println("Entrenando Perceptrón SIN sesgo para AND...");
        Perceptron perceptronAnd = new Perceptron(2, 0.1);
        perceptronAnd.entrenar(Dataset.obtenerEntradasAND(), Dataset.obtenerSalidasAND(), 100);
        perceptronAnd.imprimirPesos();

        // Entrenar Perceptrón CON SESGO para compuerta OR
        System.out.println("\nEntrenando Perceptrón CON sesgo para OR...");
        Perceptron perceptronOr = new Perceptron(2, 0.1);
        perceptronOr.entrenar(Dataset.obtenerEntradasOR(), Dataset.obtenerSalidasOR(), 100);
        perceptronOr.imprimirPesos();
    }
}
