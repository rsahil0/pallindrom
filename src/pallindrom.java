import java.util.Scanner;

public class pallindrom {
    public static void main(String[] args) {

        int x,r;
        System.out.println("Enter any Number");
        Scanner ref = new Scanner(System.in);
        x = ref.nextInt();

        while (x>0){
            r = x%10;
            System.out.println(r);
            x = x/10;
        }
    }
}
