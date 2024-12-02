package function.consumer.task1;


import java.util.function.Consumer;

class Test {
    public static void main(String[] args) {
        Consumer<String> upperConsumer = s -> System.out.println(s.toUpperCase());
        Consumer<String> lengthConsumer = s -> System.out.println(s.length());
        StringProcessor.processString("Hello", upperConsumer);
        StringProcessor.processString("Hello", lengthConsumer);
    }
}