package extraWorkExercises.repositories;

import extraWorkExercises.models.Traffic;

import java.util.List;

public interface ITrafficRepository {
    void addTheTruck(Traffic truck);

    void addTheCar(Traffic car);

    void addTheMotorbike(Traffic motorbike);

    List<Traffic> showAll();
    List<Traffic> showTruckList();
    List<Traffic> showCarList();
    List<Traffic> showMotorList();

    Traffic findControlPlate(String controlPlate);

    void remove(String controlPlate);


    List<Traffic> searchControlPlate(String controlPlate);
}
