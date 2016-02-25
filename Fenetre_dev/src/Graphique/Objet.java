package Graphique;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import complexe.ComplexeInt;
import complexe.Complexebool;

import java.awt.Color;
import javax.swing.JPanel;


public class Objet extends JPanel {
    private Complexebool back = new Complexebool();
    private ComplexeInt pos = new ComplexeInt(25, 25);
    private ComplexeInt dim = new ComplexeInt(50, 50);
    private Color color;
    private int Vitesse;
    private boolean animated;
    private int Form;
    private boolean collision;
    private ComplexeInt dernierContact;

    public Objet() {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
    }

    public Objet(Color col) {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
        this.color = col;
    }

    public Objet(ComplexeInt position) {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
        this.pos = position;
    }

    public Objet(Color col, ComplexeInt position) {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
        this.color = col;
        this.pos = position;
    }

    public Objet(Color col, ComplexeInt position, int vitesse) {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
        this.color = col;
        this.pos = position;
        if(vitesse < 0) {
            vitesse = -vitesse;
        }

        this.Vitesse = vitesse;
    }

    public Objet(Color col, ComplexeInt position, int vitesse, int form) {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
        this.color = col;
        this.pos = position;
        if(vitesse < 0) {
            vitesse = -vitesse;
        }

        this.Vitesse = vitesse;
        this.Form = form;
    }

    public Objet(ComplexeInt position, ComplexeInt dimention) {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
        this.pos = position;
        this.dim = dimention;
    }

    public Objet(Color col, ComplexeInt position, ComplexeInt dimention, int vitesse) {
        this.color = Color.red;
        this.Vitesse = 1;
        this.animated = true;
        this.Form = 2;
        this.collision = true;
        this.dernierContact = new ComplexeInt(-1, -1);
        this.color = col;
        this.pos = position;
        this.dim = dimention;
        if(vitesse < 0) {
            vitesse = -vitesse;
        }

        this.Vitesse = vitesse;
    }

    public void moveX(int X) {
        this.pos.setRe(this.pos.getRe() + X);
    }

    public void moveY(int Y) {
        this.pos.setIm(this.pos.getIm() + Y);
    }

    public void inverserBackX() {
        if(this.back.getRe()) {
            this.back.setRe(false);
        } else {
            this.back.setRe(true);
        }

    }

    public void inverserBackY() {
        if(this.back.getIm()) {
            this.back.setIm(false);
        } else {
            this.back.setIm(true);
        }

    }

    public void setDernierContact(int dernierContact) {
        this.dernierContact.setIm(this.dernierContact.getRe());
        this.dernierContact.setRe(dernierContact);
    }

    public void setVitesse(int vitesse) {
        if(vitesse < 0) {
            vitesse = -vitesse;
        }

        this.Vitesse = vitesse;
    }

    public ComplexeInt getPos() {
        return this.pos;
    }

    public void setPos(ComplexeInt position) {
        this.pos = position;
    }

    public void setPos(int x, int y) {
        this.pos.setRe(x);
        this.pos.setIm(y);
    }

    public int getPosX() {
        return this.pos.getRe();
    }

    public void setPosX(int posX) {
        this.pos.setRe(posX);
    }

    public int getPosY() {
        return this.pos.getIm();
    }

    public void setPosY(int posY) {
        this.pos.setIm(posY);
    }

    public void setBack(Complexebool back) {
        this.back = back;
    }

    public void setBackX(boolean back) {
        this.back.setRe(back);
    }

    public void setBackY(boolean back) {
        this.back.setIm(back);
    }

    public Complexebool getBack() {
        return this.back;
    }

    public boolean getBackX() {
        return this.back.getRe();
    }

    public boolean getBackY() {
        return this.back.getIm();
    }

    public ComplexeInt getDim() {
        return this.dim;
    }

    public void setDim(ComplexeInt dim) {
        this.dim = dim;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public int getVitesse() {
        return this.Vitesse;
    }

    public boolean isAnimated() {
        return this.animated;
    }

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public int getForm() {
        return this.Form;
    }

    public void setForm(int form) {
        this.Form = form;
    }

    public boolean isCollision() {
        return this.collision;
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }

    public ComplexeInt getDernierContact() {
        return this.dernierContact;
    }

    public void setDernierContact(ComplexeInt dernierContact) {
        this.dernierContact = dernierContact;
    }
}
