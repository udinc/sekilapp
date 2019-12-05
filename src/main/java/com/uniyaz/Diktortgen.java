package com.uniyaz;

public class Diktortgen extends Sekil {
    private int en;
    private int boy;

    public Diktortgen(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    @Override
    public void alanHesapla() {
        int aln = en * boy;
        System.out.println("dikdortken"+aln);
    }
}
