import com.aca.carfabric.CarFabric;
import com.aca.carfabric.PriceCalculator;
import com.aca.carfabric.engine.car.Vehicle;
import com.aca.carfabric.ui.models.UIType;

public class Main {
    public static void main(String[] args) {
        CarFabric carFabric = new CarFabric(UIType.TERMINAL);
        Vehicle vehicle = carFabric.produceVehicle();
        System.out.println(String.format("The price of your vehicle will be %s USD.", PriceCalculator.getPrice(vehicle)));
    }
}
