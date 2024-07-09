package TestJenericks;

import dataStructure.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
    }

    public void extendTest(List<? extends Cat> list){
        Animal cat = list.get(0);


    }

    public void superTest(Cat cat,Animal someAnimal){
        YellowCat yellowCat = new YellowCat();
        // Создаем список с указанием super
        List<? super Cat> list = new ArrayList<>();
        list.add(cat);
        list.add(yellowCat);
        Object object = list.get(0);
    }

}
