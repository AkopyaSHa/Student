package ru.arl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hashtag education = new Hashtag("Обучение");
        Hashtag fun = new Hashtag("Развлечение");
        Hashtag programming = new Hashtag("Программирование");

        Task businessGame = new Task("Business Game", "Деловая игра", new ArrayList<>(), Arrays.asList(education, fun));
        Student ruben = new Student("Ruben", "akoyasha@bk.ru", Arrays.asList(businessGame));
        businessGame.getStudents().add(ruben);
    }
}
