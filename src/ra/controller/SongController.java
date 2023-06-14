package ra.controller;

import ra.service.SongService;

public class SongController {
    private SongService songService = new SongService();

    public void displayList(){
        songService.displayList();
    }
    public void add(){
        songService.add();
    }
    public void edit(){
        songService.edit();
    }
    public void delete(){
        songService.delete();
    }
}
