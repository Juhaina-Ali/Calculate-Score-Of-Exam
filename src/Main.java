import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = read.next();

        String[] q = {"2 + 2 = ", "6 - 3 = ", "4 * 2 = ", " 12 / 2 = "};
        String[] ans = {"4", "3", "8", "6"} ;

        int score=0;
        for(int i = 0 ; i< q.length; i++){
            System.out.println(q[i]);
            String a = read.next();
            if (a.equals(ans[i])){
                System.out.println("Correct");
                score++;
            }else {
                System.out.println("Wrong");
            }
        }
        System.out.println("Your score is "+ score +" of 5");

    }
}