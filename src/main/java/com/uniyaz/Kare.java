package com.uniyaz;

class Kare extends Sekil {
    private int en;

    @Override
    public void alanHesapla() {
        int aln = en * en;
        System.out.println("dikdortken"+aln);
    }

    public Kare(int en) {
        this.en = en;
    }

    public int getEn() {
        return this.en;
    }

    public void setEn(int en) {
        this.en = en;
    }
}


