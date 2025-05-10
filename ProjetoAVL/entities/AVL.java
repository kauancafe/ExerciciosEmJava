package entities;

public class AVL {

    private No raiz;

    public AVL(int info) {
        this.raiz = new No(info);
    }

    public boolean arvoreVazia() {
        return this.raiz == null;
    }

    public void insere(int info) {
        this.raiz = insere(this.raiz, info);
    }

    private No insere(No raiz, int info) {
        if (raiz == null) {
            return new No(info);
        }

        if (info < raiz.getInfo()) {
            raiz.setProxEsq(insere(raiz.getProxEsq(), info));
        } else if (info > raiz.getInfo()) {
            raiz.setProxDir(insere(raiz.getProxDir(), info));
        } else {
            return raiz;
        }

        raiz.setAltura(1 + maior(altura(raiz.getProxEsq()), altura(raiz.getProxDir())));

        int balance = fatorBalanceamento(raiz);

        if (balance > 1 && info < raiz.getProxEsq().getInfo()) {
            return rotacaoDireita(raiz);
        }

        if (balance < -1 && info > raiz.getProxDir().getInfo()) {
            return rotacaoEsquerda(raiz);
        }

        if (balance > 1 && info > raiz.getProxEsq().getInfo()) {
            raiz.setProxEsq(rotacaoEsquerda(raiz.getProxEsq()));
            return rotacaoDireita(raiz);
        }

        if (balance < -1 && info < raiz.getProxDir().getInfo()) {
            raiz.setProxDir(rotacaoDireita(raiz.getProxDir()));
            return rotacaoEsquerda(raiz);
        }

        return raiz;
    }

    public void remove(int info) {
        raiz = remove(raiz, info);
    }

    private No remove(No raiz, int info) {
        if (raiz == null) return null;

        if (info < raiz.getInfo()) {
            raiz.setProxEsq(remove(raiz.getProxEsq(), info));
        } else if (info > raiz.getInfo()) {
            raiz.setProxDir(remove(raiz.getProxDir(), info));
        } else {
            if (raiz.getProxEsq() == null && raiz.getProxDir() == null) {
                return null;
            }

            if (raiz.getProxEsq() == null) {
                return raiz.getProxDir();
            }
            if (raiz.getProxDir() == null) {
                return raiz.getProxEsq();
            }

            No sucessor = minimo(raiz.getProxDir());
            raiz.setInfo(sucessor.getInfo());
            raiz.setProxDir(remove(raiz.getProxDir(), sucessor.getInfo()));
        }
        return raiz;
    }

    private No rotacaoDireita(No y) {
        No x = y.getProxEsq();
        No T2 = x.getProxDir();

        x.setProxDir(y);
        y.setProxEsq(T2);

        y.setAltura(1 + maior(altura(y.getProxEsq()), altura(y.getProxDir())));
        x.setAltura(1 + maior(altura(x.getProxEsq()), altura(x.getProxDir())));

        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.getProxDir();
        No T2 = y.getProxEsq();

        y.setProxEsq(x);
        x.setProxDir(T2);

        x.setAltura(1 + maior(altura(x.getProxEsq()), altura(x.getProxDir())));
        y.setAltura(1 + maior(altura(y.getProxEsq()), altura(y.getProxDir())));

        return y;
    }

    private int maior(int a, int b) {
        return (a > b) ? a : b;
    }

    private int altura(No raiz) {
        if (raiz == null) {
            return -1;
        }

        int alturaEsq = altura(raiz.getProxEsq());
        int alturaDir = altura(raiz.getProxDir());

        return 1 + (alturaEsq > alturaDir ? alturaEsq : alturaDir);
    }

    public int fatorBalanceamento(No raiz) {
        if (raiz == null) {
            return 0;
        }
        return altura(raiz.getProxEsq()) - altura(raiz.getProxDir());
    }

    private void atualizarAltura(No no) {
        int alturaEsq = altura(no.getProxEsq());
        int alturaDir = altura(no.getProxDir());
        no.setAltura(1 + (alturaEsq > alturaDir ? alturaEsq : alturaDir));
    }

    private No balancear(No no) {
        int fb = fatorBalanceamento(no);
        if (fb > 1) {
            if (fatorBalanceamento(no.getProxEsq()) < 0) {
                no.setProxEsq(rotacaoEsquerda(no.getProxEsq()));
            }
            return rotacaoDireita(no);
        }
        if (fb < -1) {
            if (fatorBalanceamento(no.getProxDir()) > 0) {
                no.setProxDir(rotacaoDireita(no.getProxDir()));
            }
            return rotacaoEsquerda(no);
        }
        return no;
    }

    public No sucessor(No no) {
        if (no.getProxDir() != null) {
            return minimo(no.getProxDir());
        }
        No sucessor = null;
        No antecessor = raiz;
        while (antecessor != no) {
            if (no.getInfo() < antecessor.getInfo()) {
                sucessor = antecessor;
                antecessor = antecessor.getProxEsq();
            } else {
                antecessor = antecessor.getProxDir();
            }
        }
        return sucessor;
    }

    public No minimo() {
        return minimo(raiz);
    }

    private No minimo(No no) {
        while (no.getProxEsq() != null) {
            no = no.getProxEsq();
        }
        return no;
    }

    public String preOrdem() {
        return preOrdem(raiz);
    }

    private String preOrdem(No no) {
        if (no == null) return "";
        return no.getInfo() + "(" + fatorBalanceamento(no) + ") " + preOrdem(no.getProxEsq()) + preOrdem(no.getProxDir());
    }

    public void emOrdem() {
        emOrdem(raiz);
    }

    private void emOrdem(No no) {
        if (no == null) {
            return;
        }
        emOrdem(no.getProxEsq());
        System.out.println(no.getInfo() + " ");
        emOrdem(no.getProxDir());
    }

    public void posOrdem() {
        if (this.raiz == null) {
            System.out.println("Árvore vazia");
        }
        posOrdem(raiz);
    }

    private void posOrdem(No no) {
        if (no == null) {
            return;
        }
        posOrdem(no.getProxEsq());
        posOrdem(no.getProxDir());
        System.out.println(no.getInfo() + " ");
    }
}