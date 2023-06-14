package ra.model;
import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer ;
    private String songWriter;
    private Date createdDate = new Date();
    private boolean songStatus;
    private Song[] songList = new Song[100];

    private int size;

    public Song() {
    }

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, Date createdDate, boolean songStatus, Song[] songList, int size) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
        this.songList = songList;
        this.size = size;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    public Song[] getSongList() {
        return songList;
    }

    public void setSongList(Song[] songList) {
        this.songList = songList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public String displayData() {
        return "Song ID: " + songId +
                " | Song Name: " + songName+"| Writer: " + songWriter+
                " | Descriptions: " + descriptions + " | Singer: " + singer+
                " | Date: " + createdDate + " | Status: " + songStatus;

    }

    public void inputData() {
        System.out.println("Nhập vào mã bài hát: ");
        while (true) {
            songId = new Scanner(System.in).nextLine();
            if (songId.length() < 4) {
                System.err.println("Mã bài hát cần ít nhất 4 kí tự");
            } else if(!songId.startsWith("S")){
                System.err.println("Mã bài hát cần bắt đầu bằng ký tự S");
            }
            else {
                setSongId(songId);
                break;
            }

        }
        System.out.println("Nhập vào tên bài hát: ");
        while (true) {
            songName = new Scanner(System.in).nextLine();
            if (songName.length() == 0) {
                System.err.println("Không được để trống");
            } else {
                setSongName(songName);
                break;
            }
        }
        System.out.println("Nhập vào tên tác giả: ");
        while (true) {
            songWriter = new Scanner(System.in).nextLine();
            if (songWriter.length() == 0) {
                System.err.println("Không được để trống");
            } else {
                setSongWriter(songWriter);
                break;
            }
        }
        System.out.println("Nhập vào mô tả: ");
            descriptions = new Scanner(System.in).nextLine();
                setDescriptions(descriptions);
        System.out.println("Nhập vào trạng thái: ");
        songStatus = new Scanner(System.in).nextBoolean();
        setSongStatus(songStatus);
//        System.out.println("Nhập id ca sĩ mà bạn muốn họ thể hiện: ");
//        int choosenId = new Scanner(System.in).nextInt();
//        for () {
//            if (singer!=null) {
//                if (singer.getSingerId()==choosenId) {
//                    setSinger(singer);
//                }
//            } else {
//                System.err.println("Danh sách ca sĩ trống! Hãy thêm ca sĩ trước");
//            }
//        }
    }
}
