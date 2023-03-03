public abstract class LazadoGep implements Urhajo {
    private double sebesseg;
    private boolean meghibasodhatE;

    public LazadoGep(double sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public boolean isMeghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }

    public abstract boolean elkapjaAVonosugar();

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        if (urhajo instanceof LazadoGep && meghibasodhatE && milyenGyors() < urhajo.milyenGyors()) {
            return true;
        } else return urhajo instanceof MilleniumFalcon && milyenGyors() > urhajo.milyenGyors() * 2;
    }

    @Override
    public double milyenGyors() {
        return this.sebesseg;
    }

    @Override
    public String toString() {
        return "LazadoGep{" +
                "sebesseg=" + sebesseg +
                ", meghibasodhatE=" + meghibasodhatE +
                '}';
    }
}
