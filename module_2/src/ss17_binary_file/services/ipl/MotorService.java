package ss17_binary_file.services.ipl;
import ss17_binary_file.models.Motorbike;
import ss17_binary_file.repositories.IMotorRepository;
import ss17_binary_file.repositories.ipl.MotorRepository;
import ss17_binary_file.services.IMotorService;

import java.util.List;

public class MotorService implements IMotorService {
    IMotorRepository iMotorRepository = new MotorRepository();
    @Override
    public void addMotor(Motorbike motorbike) {
        iMotorRepository.addMotor(motorbike);
    }

    @Override
    public List<Motorbike> showList() {
        return iMotorRepository.showList();
    }

    @Override
    public Motorbike findMotor(String id) {
        return iMotorRepository.findMotor(id);
    }
}
