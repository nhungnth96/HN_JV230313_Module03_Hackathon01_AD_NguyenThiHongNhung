package ra.service;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class SongService {
    private Song song = new Song();
    private Song[] songList = new Song[100];
    private int size;

    // display
    public void displayList() {
        if (size == 0) {
            System.out.println("Danh sách bài hát trống");
        }
        for (Song song : songList) {
            if (song != null) {
                System.out.println(song.displayData());
            }

        }
    }

    // add
    public void add() {
        Song newSong = new Song();
        System.out.println("Nhập số lượng bài hát thêm mới ");
        int quantity = new Scanner(System.in).nextInt();
        newSong.inputData();
        if (checkList(newSong)) {
            System.out.println("Thêm mới bài hát thành công!");
        }
    }


    public boolean checkList(Song song) {
        for (int i = 0; i < songList.length; i++) {
            if (songList[i] == null) {
                songList[i] = song;
                size++;
                break;
            }
        }
        return true;
    }

    // edit 
    public Song findbyId(String id) {
        for (Song song : songList) {
            if (song != null) {
                if (song.getSongId().equals(id)) {
                    return song;
                }
            }
        }
        return null;
    }

    public void edit() {
        System.out.println("Nhập mã bài hát bạn muốn sửa: ");
        String editedId = new Scanner(System.in).nextLine();
        Song editedSong = findbyId(editedId);
        if (editedSong != null) {
            System.out.println("New name: " + "(Old: " + editedSong.getSongName() + ")");
            editedSong.setSongName(new Scanner(System.in).nextLine());
            System.out.println("New writer: " + "(Old: " + editedSong.getSongWriter() + ")");
            editedSong.setSongWriter(new Scanner(System.in).nextLine());
            System.out.println("New descriptions: " + "(Old: " + editedSong.getDescriptions() + ")");
            editedSong.setDescriptions(new Scanner(System.in).nextLine());
//            System.out.println("New singer: " + "(Old: " + song.getSinger() + ")");
//            editedSong.setSinger(new Scanner(System.in).next());
            System.out.println("New status: " + "(Old: " + editedSong.isSongStatus() + ")");
            editedSong.setSongStatus(new Scanner(System.in).nextBoolean());
            for (int i = 0; i < songList.length; i++) {
                if (song.getSongId().equals(editedSong.getSongId())) {
                    songList[i] = editedSong;
                    break;
                }
                System.out.println("Thay đổi thông tin bài hát thành công!");
            }
        } else {
            System.err.println("Không tìm thấy mã bài hát này!");
        }

    }

    public void delete() {
        System.out.println("Nhập mã bài hát bạn muốn xóa: ");
        String deleteId = new Scanner(System.in).nextLine();
        Song deleteSong = findbyId(deleteId);
        if (deleteSong != null) {
            System.out.println(deleteSong.displayData());
            System.out.println("Bạn có chắc chắn muốn xóa bài hát này?");
            System.out.println("1.Có");
            System.out.println("2.Không");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < songList.length; i++) {
                        if (songList[i] != null) {
                            if (songList[i].getSongId().equals(deleteId)) {
                                songList[i] = null;
                                size--;
                                break;
                            }
                        }
                    }
                    System.out.println("Xóa bài hát thành công");
                    break;
                case 2:
                    break;
                default:
                    System.err.println("Vui lòng nhập số 1 hoặc 2");
            }
        } else {
            System.err.println("Không tìm thấy mã bài hát này!");
        }
    }
}