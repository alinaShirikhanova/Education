package function.consumer.task4;

import java.util.List;
import java.util.function.Consumer;

public class StringRemover {
    public static void printRemovedStrings(List<String> list, Consumer<String> stringRemover){
        for (String line : list){
            stringRemover.accept(line);
        }
    }
}

class Test {
    public static void main(String[] args) {
//        Consumer<String> remover = str -> str.length() < 4?
    }
}