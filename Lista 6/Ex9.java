import java.util.Scanner;;
public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num=1000;
        
        while (num<=9999){
            if (num == (((num/100)+(num%100))*((num/100)+(num%100)))) {
                System.out.printf("%d: %d+%d=%d = %d^2=%d \n",num,num/100,num%100,(num/100)+(num%100),(num/100)+(num%100),num);
            }
            num++;
        }
    }
}
