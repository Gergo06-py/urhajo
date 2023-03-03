public class MilleniumFalcon implements Urhajo, Hiperhajtomu{
    private double tapasztalat;

    public MilleniumFalcon() {
        this.tapasztalat = 100.0;
    }

    public double getTapasztalat() {
        return tapasztalat;
    }

    public void setTapasztalat(double tapasztalat) {
        this.tapasztalat = tapasztalat;
    }

    @Override
    public void hiperUgras() {
        setTapasztalat(getTapasztalat() + 500);
    }

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {

        return urhajo.milyenGyors() < milyenGyors();
    }

    @Override
    public double milyenGyors() {
        return getTapasztalat() * 2;
    }

    @Override
    public String toString() {
        return "MilleniumFalcon{" +
                "tapasztalat=" + tapasztalat +
                '}';
    }
}
