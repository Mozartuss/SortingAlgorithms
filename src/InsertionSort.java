class InsertionSort {
  static int[] insertionSort(int[] toSort) {
    int steps = 0;
    final double startTime = System.currentTimeMillis();

    for (int i = 0; i < toSort.length - 1; i++) {
      for (int j = toSort.length - 1; j > 0; j--) {
        if (toSort[j - 1] > toSort[j]) {
          int temp = toSort[j];
          toSort[j] = toSort[j - 1];
          toSort[j - 1] = temp;
          steps++;
        }
      }
    }
    final double stopTime = System.currentTimeMillis();
    final double duration = (stopTime - startTime) / 1000;
    System.out.println("Dauer des InsertionSort in Sec: " + duration + " Schritte: " + steps);
    return toSort;
  }
}


