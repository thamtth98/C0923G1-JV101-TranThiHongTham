package ss17_binary_file.repositories.ipl;

import ss16_IO_text_file.read_file_csv.ReadFile;
import ss17_binary_file.models.Motorbike;
import ss17_binary_file.repositories.IMotorRepository;
import ss17_binary_file.utils.WriteFile;

import java.util.ArrayList;
import java.util.List;

import static ss17_binary_file.utils.ReadFile.readFile;

public class MotorRepository implements IMotorRepository {
    List<Motorbike> motorbikeList = new ArrayList<>();
    WriteFile writeFile = new WriteFile();


    @Override
    public void addMotor(Motorbike motorbike)  {
       motorbikeList.add(motorbike);
       writeFile.addMotor(motorbikeList);
    }

    @Override
    public List<Motorbike> showList() {
        return readFile();
    }

    @Override
    public Motorbike findMotor(String id) {
        for (Motorbike motorbike:motorbikeList){
            if(motorbike.getId().equalsIgnoreCase(id)){
                return motorbike;
            }
        }
        return null;
    }
}
