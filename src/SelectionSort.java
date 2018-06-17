class SelectionSort {
  static int[] selectionSort(int[] toSort) {
    final double startTime = System.currentTimeMillis();
    for (int i = 0; i < toSort.length - 1; i++) {
      for (int j = i + 1; j < toSort.length; j++) {
        if (toSort[i] > toSort[j]) {
          int temp = toSort[i];
          toSort[i] = toSort[j];
          toSort[j] = temp;
        }
      }
    }
    final double stopTime = System.currentTimeMillis();
    final double duration = (stopTime - startTime) / 1000;
    System.out.println("Dauer des Selectionsort in Sec: " + duration);
    return toSort;
  }
}


