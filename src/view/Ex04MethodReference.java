package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

public class Ex04MethodReference {
    public static void main(String[] args) {
        List<Apple> inventory = DataModel.getApples();

        // Function<T, R>
        // (Class c) -> c.getProperty(); --> Class::getProperty

        transfer(inventory, Apple::getColor).forEach(System.out::println);
        transfer(inventory, Apple::getCountry).forEach(System.out::println);

        Set<Integer> ids = transfer(inventory, Ex04MethodReference::getAppleId);
        ids.forEach(s -> System.out.println(s));
    }

    private static Integer getAppleId(Apple apple) {
        return apple.getId();
    }

    private static <E, R> Set<R> transfer(List<E> elements, Function<E, R> function) {
        Set<R> rs = new HashSet<>();
        for (E element : elements) {
            rs.add((function.apply(element)));
        }
        return rs;
    }
}
