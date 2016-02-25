package complexe;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class ComplexeInt {
    private int _im;
    private int _re;

    public ComplexeInt() {
        this._im = 0;
        this._re = 0;
    }

    public ComplexeInt(int re, int im) {
        this._im = im;
        this._re = re;
    }

    public static ComplexeInt[] newTableComplexeInt(int size) {
        ComplexeInt[] table;
        if(size <= 0) {
            table = new ComplexeInt[1];
            return table;
        } else {
            table = new ComplexeInt[size];

            for(int i = 0; i < size; ++i) {
                table[i] = new ComplexeInt();
            }

            return table;
        }
    }

    public int getIm() {
        return this._im;
    }

    public void setIm(int im) {
        this._im = im;
    }

    public int getRe() {
        return this._re;
    }

    public void setRe(int re) {
        this._re = re;
    }

    public void set(int re, int im) {
        this._re = re;
        this._im = im;
    }

    public ComplexeInt addition(ComplexeInt c2) {
        ComplexeInt c3 = new ComplexeInt();
        c3._re = this._re + c2._re;
        c3._im = this._im + c2._im;
        return c3;
    }
}
