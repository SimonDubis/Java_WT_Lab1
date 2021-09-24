package java_fundamentals;

import java.util.*;

public class Lab8 {

    private static final int N = 5;
    private static List<Integer> firstArr = new ArrayList<>();
    private static List<Integer> secondArr = new ArrayList<>();
    private static Map<Integer, Boolean> indexes = new HashMap<>();

    public static void main(String[] args) {
        System.out.print("Enter first sequence: ");
        fillArray(firstArr);
        System.out.print("Enter second sequence: ");
        fillArray(secondArr);
        indexSearch();
        showNewIndexes();
    }

    private static void fillArray(List<Integer> arrayList) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }
    }

    private static void indexSearch() {
        int index = 0;
        for(int i = 0; i < N; i++) {
            if(!secondArr.isEmpty()) {
                if(firstArr.get(i) < secondArr.get(0)) {
                    indexes.put(index, false);
                } else {
                    indexes.put(index, true);
                    secondArr.remove(0);
                    i--;
                }
                index++;
            }else {
                return;
            }
        }
        addLast(index);
    }

    private static void addLast(int index) {
        while(!secondArr.isEmpty()) {
            indexes.put(index++, true);
            secondArr.remove(0);
        }
    }

    private static void showNewIndexes() {
        for (int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i)) {
                System.out.printf("%d ", i);
            }
        }
    }
}
