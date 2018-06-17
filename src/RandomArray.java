import java.util.Random;

class RandomArray {
  static int[] randomArray(int arraySize, int range) {
    final double startTime = System.currentTimeMillis();
    int[] u = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      Random random = new Random();
      u[i] = random.nextInt(range);
    }
    final double stopTime = System.currentTimeMillis();
    final double duration = (stopTime - startTime);
    System.out.println("Dauer des RandomGeneartors in Ms: " + duration);
    return u;
  }

}


