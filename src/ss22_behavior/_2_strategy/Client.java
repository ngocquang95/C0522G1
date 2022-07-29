package ss22_behavior._2_strategy;

public class Client {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();


        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();


        sortedList.setSortStrategy(new SelectionSort());
        sortedList.sort();
    }
}
