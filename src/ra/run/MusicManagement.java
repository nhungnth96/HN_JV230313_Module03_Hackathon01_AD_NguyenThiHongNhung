package ra.run;

import ra.controller.SingerController;
import ra.controller.SongController;

import java.util.Scanner;

public class MusicManagement {
    static SingerController singerController = new SingerController();
    static SongController songController = new SongController();
    public static void main(String[] args) {
        while (true) {
            System.out.println("====MUSIC-MANAGEMENT====");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kếm bài hát");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: // singer
                    singerMenu();
                    break;
                case 2: // song
                    songMenu();
                    break;
                case 3: // search
                    searchMenu();
                    break;
                case 4: // exit
                    System.out.println("Thank you!!!");
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-4");
            }
        }
    }

    public static void singerMenu() {
        while (true) {
            System.out.println("====SINGER-MANAGEMENT====");
            System.out.println("1. Thêm mới ca sĩ ( Số lượng và thông tin )");
            System.out.println("2. Hiển thị danh sách ca sĩ");
            System.out.println("3. Thay đổi thông tin ca sĩ theo mã ID");
            System.out.println("4. Xóa ca sĩ theo mã ID ");
            System.out.println("5. Quay lại");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: // add
                    singerController.add();
                    break;
                case 2: // display
                    singerController.displayList();
                    break;
                case 3: // edit
                    singerController.edit();
                    break;
                case 4: // delete
                    singerController.delete();
                    break;
                case 5: // exit
                    break;
                default:
                    System.err.println("Vui lòng nhập từ 1-5");
            }
            if (choice == 5) {
                break;
            }
        }
    }
    public static void songMenu() {
        while (true) {
            System.out.println("====SONG-MANAGEMENT====");
            System.out.println("1. Thêm mới bài hát ( Số lượng và thông tin)");
            System.out.println("2. Hiển thị danh sách bài hát");
            System.out.println("3. Thay đổi thông tin bài hát theo mã ID");
            System.out.println("4. Xóa bài hát theo mã ID ");
            System.out.println("5. Quay lại");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: // add
                songController.add();
                    break;
                case 2: // display
                    songController.displayList();
                    break;
                case 3: // edit
                    songController.edit();
                    break;
                case 4: // delete
                    songController.delete();
                    break;
                case 5: // exit
                    break;
                default:
                    System.err.println("Vui lòng nhập từ 1-5");
            }
            if (choice == 5) {
                break;
            }
        }
    }
    public static void searchMenu() {
        while (true) {
            System.out.println("====SEARCH-MANAGEMENT====");
            System.out.println("1. Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại");
            System.out.println("2. Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3. Hiển thị danh sách tên bài hát theo thứ tự tăng dần");
            System.out.println("4. Hiển thị 10 bài hát được đăng mới nhất ");
            System.out.println("5. Quay lại");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: // add

                    break;
                case 2: // display
                    ;
                    break;
                case 3: // edit
                    break;
                case 4: // delete
                    break;
                case 5: // exit
                  break;
                default:
                    System.err.println("Vui lòng nhập từ 1-5");
            }
            if (choice == 5) {
                break;
            }
        }
    }
}
