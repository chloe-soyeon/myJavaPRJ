package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("김영운");
        list.add("이종두");
        list.add("이인수");

        list.size();
        System.out.println("저장된 데이터 수 :" + list.size());

        System.out.println("1세대 반복문");
        for (int i = 0 ; i < list.size();i++) {
            System.out.println("이름 : " + list.get(i));
        }

        System.out.println("2세대 반복문");
        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        //람다식 표현방법 (성능은 비슷하나, 코드 길이가 더 짦음) 별도의 데이터 타입을 정의하지 않아도 됨!!!
        System.out.println("3세대 반복문");
        list.forEach( name -> System.out.println("이름 : " + name)); //list안의 값의 하나씩 꺼내서 -> 출력하라
    }
}
