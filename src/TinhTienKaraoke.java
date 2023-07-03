import java.util.Scanner;

public class TinhTienKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giờ bắt đầu: ");
        int gioBatDau = scanner.nextInt();
        System.out.print("Nhập số giờ kết thúc: ");
        int gioKetThuc = scanner.nextInt();

        int tongTienNuoc = 0;
        int tongTienHat = 0;
        
        if (gioBatDau >= 9 && gioKetThuc <= 24 && gioBatDau < gioKetThuc) {
            // Tính tiền hát từ 9h đến 17h 
        	int gioGiamGia = Math.min(gioKetThuc, 17) - gioBatDau;
        	int gioKhongGiamGia = gioKetThuc - Math.max(gioBatDau, 17);
        	
            if (gioGiamGia > 0) {
            	tongTienHat += 30000 * Math.min(gioGiamGia, 3);
                if(gioGiamGia > 3) {
                	tongTienHat += (gioGiamGia - 3) * 30000 * 0.7;
                }
                tongTienHat *= 0.8;
            }
            
            if (gioKhongGiamGia > 0) {
            	tongTienHat += 30000 * Math.min(gioKhongGiamGia, 3);
                if(gioKhongGiamGia > 3) {
                	tongTienHat += (gioKhongGiamGia - 3) * 30000 * 0.7;
                }
            }
            
            
            // tính tiền số chai nước uống
            System.out.print("Nhập số chai nước uống: ");
            int soChai = scanner.nextInt();
            tongTienNuoc = soChai * 10000;

            System.out.println("Số tiền bạn cần phải trả là : " + (tongTienHat + tongTienNuoc));
        } else {
            System.out.println("Khung giờ không hợp lệ");
        }
    }
}
