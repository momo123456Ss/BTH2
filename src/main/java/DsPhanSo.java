import java.util.ArrayList;
import java.util.Scanner;

public class DsPhanSo {
    public static void main(String []args){
        int tu = 0,mau = 1,check = 1;
        Scanner scanner = new Scanner(System.in);
        ArrayList<PhanSo> phanso = new ArrayList<PhanSo>();
        while (true){
            System.out.println("Nhập tử số : ");
            tu = scanner.nextInt();
            System.out.println("Nhập mẫu số : ");
            mau = scanner.nextInt();
            PhanSo ps = new PhanSo(tu,mau);
            phanso.add(ps);
            System.out.println("Tiếp tục bấm 1 kết thúc bấm 0 : ");
            check = scanner.nextInt();
            if (check == 1) continue;
            else break;
        }
        System.out.println(phanso);
    }
}
