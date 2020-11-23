package linkedList;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node {
    private Object value;
    private Node next;
}
