public class WeightUtils {
    final static double TOLERANCE_FOR_WEIGHT = 5.0;

    public static void defineWeight(double weight, double length) {

        if (weight <= 0 || length <= 0) {
            throw new IllegalArgumentException(String.format("Weight or lentgth must be more than 0!!!." +
                    " Values(weight: %f, height: %f)", weight, length));

        }
        double idealWeight = Math.ceil((length - 100.0) * 0.90);
        if (idealWeight == weight

                || (idealWeight + TOLERANCE_FOR_WEIGHT >= weight
                && idealWeight + TOLERANCE_FOR_WEIGHT <= weight + TOLERANCE_FOR_WEIGHT)

                || (idealWeight - TOLERANCE_FOR_WEIGHT <= weight
                && idealWeight - TOLERANCE_FOR_WEIGHT >= weight - TOLERANCE_FOR_WEIGHT

        )) {
            System.out.println("This is weight is ideal");
        } else {
            System.out.println("This is weight is not ideal!!!");
        }

    }


    public static void main(String[] args) {
        defineWeight(69, 174.0);

    }
}
