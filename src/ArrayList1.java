import java.util.ArrayList;
import java.util.*;

public class ArrayList1 {

        static Random rand = new Random();
        static ArrayList<Integer> list1 = new ArrayList<>();

        public static  void listgenerate() {
            for (int i = 0; i < 50; i++) {
                list1.add(rand.nextInt(50));
            }
            for (Integer element : list1) {
                System.out.print(element+ " ");
            }
        }

}