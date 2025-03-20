class LengthConverter{

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main (String[] args) {

        System.out.println("Feet\tMeters\t \tMeters\tFeet");
        System.out.println("----------------------------------------");

        for (int i = 1; i <= 10; i++) {
            double feet = i;
            double meters = i;

            double feetToMeters = footToMeter(feet);

            double metersToFeet = meterToFoot(meters);

            System.out.printf("%.1f\t \t%.3f\t  \t%.1f\t \t%.3f%n", feet, feetToMeters, meters, metersToFeet);
        }
    }
}
