 import java.util.Scanner;
 public class Main{
 public static void main(String[] args) {
        Scanner sf = new Scanner(System.in);
        int rows = sf.nextInt();
        char[][] charArray = new char[rows][5];
        boolean available = false;
        for(int i=0;i<rows;i++){
            String aux = sf.next();
            for(int j=0;j<5;j++){
                charArray[i][j]=aux.charAt(j);//positioning string char-

            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 4; j++) {
                if (charArray[i][j] == 'O' && charArray[i][j + 1] == 'O') {
                    available = true;
                    charArray[i][j] = charArray[i][j + 1] = '+';
                    break;
                }
            }
            if (available) {
                break;
            }
        }
        if (available) {
            System.out.println("YES");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(charArray[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}
