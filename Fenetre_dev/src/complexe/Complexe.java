package complexe;


public class Complexe {
    private Double _im;
    private Double _re;

    public Complexe() {
        this._im = Double.valueOf(0.0D);
        this._re = Double.valueOf(0.0D);
    }

    public Complexe(Double re, Double im) {
        this._im = im;
        this._re = re;
    }

    public Double getIm() {
        return this._im;
    }

    public void setIm(Double im) {
        this._im = im;
    }

    public Double getRe() {
        return this._re;
    }

    public void setRe(Double re) {
        this._re = re;
    }

    public Complexe addition(Complexe c2) {
        Complexe c3 = new Complexe();
        c3._re = Double.valueOf(this._re.doubleValue() + c2._re.doubleValue());
        c3._im = Double.valueOf(this._im.doubleValue() + c2._im.doubleValue());
        return c3;
    }
}
