package complexe;

public class Complexebool {
    private boolean _im;
    private boolean _re;

    public Complexebool() {
        this._im = true;
        this._re = true;
    }

    public Complexebool(boolean re, boolean im) {
        this._im = im;
        this._re = re;
    }

    public static Complexebool[] newTableComplexeBoolean(int size) {
        Complexebool[] table;
        if(size <= 0) {
            table = new Complexebool[1];
            return table;
        } else {
            table = new Complexebool[size];

            for(int i = 0; i < size; ++i) {
                table[i] = new Complexebool();
            }

            return table;
        }
    }

    public boolean getIm() {
        return this._im;
    }

    public void setIm(boolean im) {
        this._im = im;
    }

    public boolean getRe() {
        return this._re;
    }

    public void setRe(boolean re) {
        this._re = re;
    }

    public void set(boolean re, boolean im) {
        this._re = re;
        this._im = im;
    }
}
