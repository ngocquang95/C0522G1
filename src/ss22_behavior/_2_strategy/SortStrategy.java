package ss22_behavior._2_strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
