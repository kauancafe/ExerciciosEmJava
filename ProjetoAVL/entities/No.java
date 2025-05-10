package entities;

class No {
    private No proxDir;
    private No proxEsq;
    private int info;
    private int altura;

    public No(int info) {
        this.proxDir = null;
        this.proxEsq = null;
        this.info = info;
        this.altura = 1;
    }

    public No getProxDir() {
        return proxDir;
    }

    public void setProxDir(No proxDir) {
        this.proxDir = proxDir;
    }

    public No getProxEsq() {
        return proxEsq;
    }

    public void setProxEsq(No proxEsq) {
        this.proxEsq = proxEsq;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}