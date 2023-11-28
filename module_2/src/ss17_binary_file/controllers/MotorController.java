package ss17_binary_file.controllers;

import ss17_binary_file.models.Motorbike;
import ss17_binary_file.services.IMotorService;
import ss17_binary_file.services.ipl.MotorService;

import java.util.List;

public class MotorController {
    IMotorService iMotorService = new MotorService();
    public void addMotor(Motorbike motorbike) {
        iMotorService.addMotor(motorbike);
    }

    public List<Motorbike> showList() {
        return iMotorService.showList();
    }

    public Motorbike findMotor(String id) {
        return iMotorService.findMotor(id);
    }
}
