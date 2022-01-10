import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int max = a;
//        if(b>max)
//            max = b;
//        if(c>max)
//            max=c;
//        System.out.println(max);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<3;i++) {
            for (int j = 0; j < 3; j++) {
                list.add(new ArrayList<>());
            }
        }
        Scanner in = new Scanner(System.in);

        for(int i = 0; i<3;i++){
            for(int j = 0;j<3;j++){
                list.get(i).add(in.nextInt());

            }
        }
        System.out.println(list);





    }
}
