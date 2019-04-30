package n1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sf = new Scanner(System.in);

        int n = sf.nextInt();
        int m = sf.nextInt();
        int r = sf.nextInt();

        int aa[] = new int[n];
        for (int i = 0; i < n; i++) {
            aa[i] = sf.nextInt();
        }
        Arrays.sort(aa,0,aa.length);


        int bb[] = new int[m];
        for (int j = 0; j <m; j++) {
            bb[j] = sf.nextInt();
        }
        Arrays.sort(bb, 0, bb.length);


        int x = r / aa[0];
        int x1 = r % aa[0];
        int y = x * bb[m-1];
        int ans = y + x1;
        //System.out.println(ans);
        System.out.println(aa[0]);
        System.out.println(bb[m-1]);


    }
}
