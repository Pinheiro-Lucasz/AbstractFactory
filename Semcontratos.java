package factory;

public class Semcontratos extends Factory {
    @Override
    Car retrieverCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new HB20(100, "Cheio", "Bordo");
        } else {
            return null;
        }
    }
}
