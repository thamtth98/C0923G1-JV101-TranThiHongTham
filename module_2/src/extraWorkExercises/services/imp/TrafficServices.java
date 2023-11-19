package extraWorkExercises.services.imp;

import extraWorkExercises.models.Traffic;
import extraWorkExercises.repositories.ITrafficRepository;
import extraWorkExercises.repositories.impl.TrafficRepository;
import extraWorkExercises.services.ITrafficServices;

import java.util.List;

public class TrafficServices implements ITrafficServices {
    private ITrafficRepository iTrafficRepository = new TrafficRepository();

    @Override
    public void addTheTruck( Traffic truck) {
        iTrafficRepository.addTheTruck(truck);
    }

    @Override
    public void addTheCar(Traffic car) {
        iTrafficRepository.addTheCar(car);
    }

    @Override
    public void addTheMotorbike(Traffic motorbike) {
        iTrafficRepository.addTheMotorbike(motorbike);
    }

    @Override
    public List<Traffic> showAll() {
       return iTrafficRepository.showAll();

    }

    @Override
    public List<Traffic> showTruckList() {
        return iTrafficRepository.showTruckList();
    }

    @Override
    public List<Traffic> showCarList() {
        return iTrafficRepository.showCarList();
    }

    @Override
    public List<Traffic> showMotorList() {
        return iTrafficRepository.showMotorList();
    }

    @Override
    public Traffic findControlPlate(String controlPlate) {
        return iTrafficRepository.findControlPlate(controlPlate);
    }

    @Override
    public void remove(String controlPlate) {
        iTrafficRepository.remove(controlPlate);
    }

    @Override
    public List<Traffic> searchControlPlate(String controlPlate) {
        return iTrafficRepository.searchControlPlate(controlPlate);
    }
}
