import java.util.Scanner;
public class TotNghiep {
    static boolean isPassed(double toan, double van, double anh, double th1, double th2, double th3, double tb12, double uutien, double diemkhuyenkhich) {
        double result = 0;
        boolean isPassed = true;
        result = ((((toan+van+anh+(th1+th2+th3)/3+diemkhuyenkhich)/4)*7+(tb12*3))/10)+uutien;
        if(result<5) {
            isPassed = false;
        }
        if(toan<=1 || van<=1 || anh<=1 || th1<=1 || th2<=1 || th3<=1) {
            isPassed = false;
        }
        System.out.println("Diem xet tot nghiep cua ban la: " + String.format("%.2f", result));
        return isPassed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem Toan: ");
        double toan = sc.nextDouble();
        System.out.print("Nhap diem Van: ");
        double van = sc.nextDouble();
        System.out.print("Nhap diem Anh: ");
        double anh = sc.nextDouble();
        System.out.print("Nhap diem TH1: ");
        double th1 = sc.nextDouble();
        System.out.print("Nhap diem TH2: ");
        double th2 = sc.nextDouble();
        System.out.print("Nhap diem TH3: ");
        double th3 = sc.nextDouble();
        System.out.print("Nhap diem trung binh lop 12: ");
        double tb12 = sc.nextDouble();
        System.out.print("Nhap diem uu tien: ");
        double uutien = sc.nextDouble();
        System.out.print("Nhap diem khuyen khich: ");
        double diemkhuyenkhich = sc.nextDouble();

        if(isPassed(toan, van, anh, th1, th2, th3, tb12, uutien, diemkhuyenkhich)) {
            System.out.println("Ban da dau tot nghiep!");
        } else {
            System.out.println("Ban da truot tot nghiep!");
        }
    }
}