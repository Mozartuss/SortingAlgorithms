class QuickSort {
  static int[] quickSort(int[] toSort, int lowestIndex, int highestIndex) {
    int n = lowestIndex;
    int h = highestIndex;
    int pivotElement = toSort[lowestIndex + (highestIndex - lowestIndex) / 2];
    while (n <= h) {
      while (toSort[n] < pivotElement) {
        n++;
      }
      while (toSort[h] > pivotElement) {
        h--;
      }
      if (n <= h) {
        int temp = toSort[n];
        toSort[n] = toSort[h];
        toSort[h] = temp;
        n++;
        h--;
      }
    }
    if (lowestIndex < h)
      quickSort(toSort, lowestIndex, h);
    if (n < highestIndex)
      quickSort(toSort, n, highestIndex);
    return toSort;
  }
}
