package ra.controller;

import ra.model.Singer;
import ra.service.SingerService;

public class SingerController {
    private SingerService singerService = new SingerService();

    public void displayList(){
        singerService.displayList();
    }
    public void add(){
        singerService.add();
    }
    public void edit(){
        singerService.edit();
    }
    public void delete(){
        singerService.delete();
    }
}
