package ss17_binary_file.repositories;

import ss17_binary_file.models.Motorbike;

import java.util.List;

public interface IMotorRepository {
    void addMotor(Motorbike motorbike);

    List<Motorbike> showList();

    Motorbike findMotor(String id);
}
