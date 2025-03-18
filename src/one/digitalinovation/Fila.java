package one.digitalinovation;

public class Fila<T>{
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }
    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    public T first(){
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
                while(true){
                    if (primeiroNo.getRefNo() != null) {
                        primeiroNo = primeiroNo.getRefNo();
                    } 
                    else {
                        break;
                    }
                }
              return (T) primeiroNo.getObject();  
        }
        return null;
    }
    public T dequeue(){
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
                while(true){
                    if (primeiroNo.getRefNo() != null) {
                        noAuxiliar = primeiroNo;
                        primeiroNo = primeiroNo.getRefNo();
                    } 
                    else {
                        noAuxiliar.setRefNo(null);
                        break;
                    }
                }
                return (T) primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }
    @Override
    public String toString(){
        StringBuilder stringRetorno = new StringBuilder();
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while (noAuxiliar != null){ 
                stringRetorno.append("[No{Objeto=").append(noAuxiliar.getObject()).append("}]--->");
                noAuxiliar = noAuxiliar.getRefNo();
            } 
            stringRetorno.append("null");
            }
            else{
                stringRetorno.append("null");
            }
        return stringRetorno.toString();
    }
}
