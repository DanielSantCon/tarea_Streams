import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Function
        Function<Integer, String> function= años->  "Mi edad es "+años;
        System.out.println(function.apply(25));

        BiFunction<Integer, Integer, String> biFunction =(tenis, numero)-> "tengo " + tenis + " pares del numero " + numero;
        System.out.println(biFunction.apply(3,7));

        //consumer
        Consumer<String> consumer= nombre -> System.out.println(nombre);
        consumer.accept("Daniel");
        BiConsumer<String,Integer> biConsumer =(nombre,edad) -> System.out.println("mi nombre es "+nombre+" y mi edad es "+edad);
        biConsumer.accept("Daniel",25);

        //Predicate
        Predicate<String> predicate= ms -> ms.length() >20;
        System.out.println(predicate.test("daniel"));


        BiPredicate<String, String> biPredicate= (ms, ms1) -> ms.length() == ms1.length();
        System.out.println(biPredicate.test("daniel","daniel"));

        Supplier<String> supplier=() -> "Function Supplier";
        System.out.println(supplier.get());




    }
}