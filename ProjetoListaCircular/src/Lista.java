public class Lista {
    private No ref;

    public Lista(){
        this.ref = null;
    }

    public boolean Vazio(){
        if(ref == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void Insere(int info){
        No novo = new No(info, ref);
        if(Vazio()){
            this.ref = novo;
            novo.setProx(novo);
            return;
        }
        if(ref.getProx().getInfo() > info){
            novo.setProx(ref.getProx());
            ref.setProx(novo);
            return;
        }
        if(ref.getInfo() < info) {
            novo.setProx(ref.getProx());
            ref.setProx(novo);
            this.ref = novo;
            return;
        }
        for(No aux = ref.getProx(); aux != ref; aux = aux.getProx()){
            if(aux.getProx() == null){
                aux.setProx(novo);
                novo.setProx(null);
            }
        }
    }
    public void Remove(int info){
        if(Vazio()){
            return;
        }
        if(ref.getInfo() == info){
            this.ref = ref.getProx();
            return;
        }
        for(No aux = ref; aux != null; aux = aux.getProx()){
            if(aux.getProx().getInfo() == info){
                aux.setProx(aux.getProx().getProx());
                return;
            }
            return;
        }
    }
    public void Imprime(){
        if(Vazio()){
            System.out.println("Lista Vazia");
            return;
        }
        else{
            for(No aux = ref.getProx(); aux != ref; aux = aux.getProx()){
                System.out.print(aux.getInfo()+" ");
            }
            System.out.println();
        }

    }
}
