package ra.service;

import ra.model.Singer;

import java.util.Scanner;

public class SingerService {
    private Singer singer = new Singer();
    private Singer[] singerList = new Singer[10];
    private int size;

    // display
    public void displayList() {
        if (size == 0) {
            System.out.println("Danh sách ca sĩ trống");
        }
        for (Singer singer : singerList) {
            if (singer != null) {
                System.out.println(singer.displayData());
            }
        }
    }

    // add
    public void add() {
        Singer newSinger = new Singer();
        System.out.println("Nhập số lượng ca sĩ thêm mới ");
        int quantity = new Scanner(System.in).nextInt();
            newSinger.inputData();
            if (checkList(newSinger)) {
                System.out.println("Thêm mới ca sĩ thành công!");
            }
        }

    public boolean checkList(Singer singer) {

        for (int i = 0; i < singerList.length; i++) {
            if (singerList[i] == null) {
                singerList[i] = singer;
                singer.setSingerId(i);
                size++;
                break;
            }
        }
        return true;
    }

    // edit
    public Singer findbyId(int id) {
        for (Singer singer : singerList) {
            if (singer != null) {
                if (singer.getSingerId() == id) {
                    return singer;
                }
            }
        }
        return null;
    }

    public void edit() {
        System.out.println("Nhập mã ca sĩ bạn muốn sửa: ");
        int editedId = new Scanner(System.in).nextInt();
        Singer editedSinger = findbyId(editedId);
        if (editedSinger != null) {
            System.out.println("New name: " + "(Old: " + editedSinger.getSingerName() + ")");
            editedSinger.setSingerName(new Scanner(System.in).nextLine());
            System.out.println("New age: " + "(Old: " + editedSinger.getAge() + ")");
            editedSinger.setAge(new Scanner(System.in).nextInt());
            System.out.println("New gender: " + "(Old: " + editedSinger.isGender() + ")");
            editedSinger.setGender(new Scanner(System.in).nextBoolean());
            System.out.println("New nationality: " + "(Old: " + editedSinger.getNationality() + ")");
            editedSinger.setNationality(new Scanner(System.in).nextLine());
            System.out.println("New genre: " + "(Old: " + editedSinger.getGenre() + ")");
            editedSinger.setGenre(new Scanner(System.in).nextLine());
            for (int i = 0; i < singerList.length; i++) {
                if (singer.getSingerId() == editedSinger.getSingerId()) {
                    singerList[i] = editedSinger;
                    break;
                }
                System.out.println("Thay đổi thông tin ca sĩ thành công!");
            }
        } else {
            System.err.println("Không tìm thấy mã ca sĩ này!");
        }

    }
// delete
public void delete() {
    System.out.println("Nhập mã ca sĩ bạn muốn xóa: ");
    int deleteId = new Scanner(System.in).nextInt();
    Singer deleteSinger = findbyId(deleteId);
    if (deleteSinger != null) {
        System.out.println(deleteSinger.displayData());
        System.out.println("Bạn có chắc chắn muốn xóa ca sĩ này?");
        System.out.println("1.Có");
        System.out.println("2.Không");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < singerList.length; i++) {
                    if (singerList[i] != null) {
                        if (singerList[i].getSingerId() == deleteId) {
                            singerList[i] = null;
                            size--;
                            break;
                        }
                    }
                }
                System.out.println("Xóa ca sĩ thành công");
                break;
            case 2:
                break;
            default:
                System.err.println("Vui lòng nhập số 1 hoặc 2!");
        }
    }
//    else if () {
//        // nếu ca sĩ có bài hát
//    }
    else {
        System.err.println("Không tìm thấy mã ca sĩ này!");
    }
}
}

