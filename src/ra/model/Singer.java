package ra.model;

import java.util.Scanner;

public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;
    private Singer[] singerList = new Singer[10];
    private int size;

    public Singer() {
    }

    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNewId() {
        int maxId = 0;
        for (Singer singer : singerList) {
            if (singer != null) {
                if (maxId < singer.getSingerId()) {
                    maxId = singer.getSingerId();
                }
            }
        }
        return maxId + 1;
    }

    public void inputData() {
//        getNewId();
        System.out.println("Nhập vào tên ca sĩ: ");
        while (true) {
            singerName = new Scanner(System.in).nextLine();
            if (singerName.length() == 0) {
                System.err.println("Không được để trống");
            } else {
                setSingerName(singerName);
                break;
            }
        }
        System.out.println("Nhập vào tuổi: ");
        while (true) {
            age = new Scanner(System.in).nextInt();
            if (age <= 0) {
                System.err.println("Tuổi phải lớn hơn 0");
            } else {
                setAge(age);
                break;
            }
        }
        System.out.println("Nhập vào giới tính: (true:Nam -- false:Nữ) ");
        gender = new Scanner(System.in).nextBoolean();
        System.out.println("Nhập vào quốc tịch: ");
        while (true) {
            nationality = new Scanner(System.in).nextLine();
            if (nationality.length() == 0) {
                System.err.println("Không được để trống");
            } else {
                setNationality(nationality);
                break;
            }
        }
        System.out.println("Nhập vào thể loại hát: ");
        while (true) {
            genre = new Scanner(System.in).nextLine();
            if (genre.length() == 0) {
                System.err.println("Không được để trống");
            } else {
                setGenre(genre);
                break;
            }
        }

    }

    public String displayData() {
        return "Singer ID: " + singerId +
                " | Singer Name: " + singerName + " | Age: " + age +
                " | Gender: " + (gender ? "Nam" : "Nữ") + " | Nationality: " + nationality +
                " | Genre: " + genre;
    }
}
