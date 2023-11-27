package ss17_binary_file.services;

import ss17_binary_file.models.Motorbike;

import java.util.List;

public interface IMotorService {
    void addMotor(Motorbike motorbike);

    List<Motorbike> showList();

    Motorbike findMotor(String id);
}
