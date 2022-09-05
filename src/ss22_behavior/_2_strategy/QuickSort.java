package ss22_behavior._2_strategy;

import java.util.List;

public class QuickSort implements SortStrategy {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Đang gọi QuickSort");
    }
}