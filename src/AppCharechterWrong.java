import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AppCharechterWrong {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size both lists");
        int numSizeList = in.nextInt();
        for (int i = 0; i < numSizeList; i++) {
            System.out.println("enter charechter1");
            String charechter = sc.next();
            list1.add(charechter);
        }
        System.out.println("enter charechters  second list");
        for (int i = 0; i < numSizeList; i++) {
            System.out.println("enter charechter2");
            String charechter = sc.next();
            list2.add(charechter);
        }
        System.out.println(list1);
        System.out.println(list2);
        long count = IntStream.range(0, numSizeList)
                .mapToObj(i -> list2.get(i) == list1.get(i) ? true : false)
                .filter(Integer -> Integer == true).count();
        System.out.println("change charecter " + count + " num");

    }
}
