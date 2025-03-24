//Humberto Hernández Trejo
public class Dataset {
    public static double[][] obtenerEntradasAND() {
        return new double[][] {
                {0, 0}, {0, 1}, {1, 0}, {1, 1}
        };
    }

    public static double[] obtenerSalidasAND() {
        return new double[] {0, 0, 0, 1};
    }

    public static double[][] obtenerEntradasOR() {
        return new double[][] {
                {0, 0}, {0, 1}, {1, 0}, {1, 1}
        };
    }

    public static double[] obtenerSalidasOR() {
        return new double[] {0, 1, 1, 1};
    }
}

