import java.util.Random;

public class XWing extends LazadoGep implements Hiperhajtomu {
    public XWing() {
        super(150, true);
    }

    @Override
    public void hiperUgras() {
        setSebesseg(new Random().nextDouble(0, 101));
    }

    @Override
    public boolean elkapjaAVonosugar() {
        return isMeghibasodhatE() && getSebesseg() < 10000;
    }

    @Override
    public String toString() {
        return "XWing{" + super.toString() + "}";
    }
}
