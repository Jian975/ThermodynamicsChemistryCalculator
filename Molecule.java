public class Molecule {
    double deltaH, deltaG, deltaS;

    Molecule(double deltaH, double deltaG, double deltaS) {
        this.deltaH = deltaH;
        this.deltaG = deltaG;
        this.deltaS = deltaS;
    }

    public double getDeltaH() {
        return deltaH;
    }

    public double getDeltaG() {
        return deltaG;
    }

    public double getDeltaS() {
        return deltaS;
    }
}