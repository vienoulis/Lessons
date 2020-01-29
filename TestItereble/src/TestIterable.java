import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> integerIterator = list.iterator();
        int index = 0;
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
            if (index == 1) integerIterator.remove();
            index++;
    }
        for (int i: list) {
            System.out.println(i);
        }
    }
}
