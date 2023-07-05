/******************************************************************************
 *  Name:              Apostolia Delikosta
 *  GitHub Username:   apostoliadel
 *  Last modified:     July 5, 2023
 *****************************************************************************/

public class DiscreteDistribution {
    public static void main(String[] args) {
		
        int numRandomNumbers = Integer.parseInt(args[0]);
        int[] probabilities = new int[args.length - 1];
        int[] cumulativeSums = new int[probabilities.length];

        // Fill the probabilities array
        for (int i = 1; i < args.length; i++) {
            probabilities[i - 1] = Integer.parseInt(args[i]);
        }

        // Fill the cumulativeSums array
        int sum = 0;
        for (int index = 0; index < probabilities.length; index++) {
            sum += probabilities[index];
            cumulativeSums[index] = sum;
        }

        int totalSum = cumulativeSums[cumulativeSums.length - 1];

        // Generate random numbers and determine the category
        for (int j = 0; j < numRandomNumbers; j++) {
            int randomNumber = (int) (Math.random() * totalSum);

            for (int p = 0; p <= cumulativeSums.length - 1; p++) {
                if (randomNumber < cumulativeSums[p]) {
                    System.out.print((p + 1) + " ");
                    break;
                }
            }
        }
    }
}
