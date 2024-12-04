package factory;

public class Demo {

    public static void main(String[] args){

        Custumer cliente = new Custumer("A", false);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Custumer cliente) {
        if (cliente.isHasCompanyContract()) {
            return new ContratosFactory();
        }else {
            return new Semcontratos();
        }
    }
}
