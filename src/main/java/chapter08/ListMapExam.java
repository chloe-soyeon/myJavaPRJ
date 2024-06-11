package chapter08;

import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //최종 저장되는 List 구조
        List<Map<String,String>> list = new ArrayList<>();

        //Lsit 구조 안에 저장될 Map 객체
        Map<String,String> map = null;

        //3명 입력
        for (int i = 0 ; i < 3 ; i++) {
            System.out.print("이름 : "); //이름 입력받기
            String name = scanner.next();

            System.out.print("이메일 : "); // 이메일 입력받기
            String email = scanner.next();

            System.out.print("부서 : "); //부서 입력받기
            String dept = scanner.next();

            map = new HashMap<>(); //List 구조에 저장할 Map 메모리에 올리기

            map.put("name", name); //입력받은 값을 name 키에 저장
            map.put("email", email); //입력받은 값을 email 키에 저장
            map.put("dept", dept); //입력받은 값을 dept 키에 저장

            list.add(map); //Map 구조를 List에 저장하기

            map = null; // 다 사용하면 메모리 비우기
        }

        //List에 저장된 데이터 수
        int listSize = list.size();
        System.out.println("저장된 데이터 수 : " + listSize);

        //1세대 반복문으로 출력
        System.out.println("1세대 반복문");
        for (int i = 0 ; i < listSize ; i++) {
            Map<String, String> rMap = list.get(i);
            System.out.println("name : " + rMap.get("name")); //이름 가져오기
            System.out.println("email : " + rMap.get("email")); //이메일 가져오기
            System.out.println("dept : " + rMap.get("dept")); //부서 가져오기

            rMap = null; //다 사용하면 메모리 비우기
        }

        //2세대 반복문 출력
        System.out.println("2세대 반복문");
        for (Map<String,String> rMap : list ) {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        }
        //3세대 반복문 출력
        System.out.println("3세대 반복문");
        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });
        //4
        list.parallelStream().forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });
    }
}
