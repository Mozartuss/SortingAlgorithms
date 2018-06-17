import java.util.Arrays;

public class Sort {
  public static void main(String[] args) {

    int arraySize = 100000;
    int range = 1000;

    int[] toSort = RandomArray.randomArray(arraySize, range);

    int[] s = SelectionSort.selectionSort(toSort);

    int[] i = InsertionSort.insertionSort(toSort);

    final double startTime = System.currentTimeMillis();
    int[] q = QuickSort.quickSort(toSort, 0, toSort.length - 1);
    final double stopTime = System.currentTimeMillis();
    final double duration = (stopTime - startTime) / 1000;
    System.out.println("Dauer des QuickSorts in Sec: " + duration);

    Arrays.sort(toSort);
    if (s == toSort)
      System.out.println("SelectionSort erfolgreich");
    else
      System.out.println("SelectionSort nicht erfolgreich");

    if (i == toSort)
      System.out.println("InsertionSort erfolgeich");
    else
      System.out.println("InsertionSort nicht erfolgreich");

    if (q == toSort)
      System.out.println("QuickSort erfolgeich");
    else
      System.out.println("QuickSort nicht erfolgreich");
  }
}


