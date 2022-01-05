import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int VNDtoUSD = 23000;

        System.out.print("Nhập số tiền dạng USD vào: ");
        int usd = userInput.nextInt();
        int vnd = usd * VNDtoUSD;

        System.out.print("Số tiền dạng VND là: " + vnd);
    }
}
