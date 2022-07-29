package ss22_behavior._2_strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy sortStrategy;
    List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        sortStrategy.sort(items); // Đa hình lúc runtime
    }
}
