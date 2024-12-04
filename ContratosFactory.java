package factory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieverCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Onix(100, "Cheio", "Bordo");
        } else {
            return null;
        }
    }
}
