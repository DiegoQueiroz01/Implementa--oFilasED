package one.digitalinovation;

public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }
    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    public No first(){
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
        }
        return null;
    }
    public No dequeue(){
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
                return primeiroNo;
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
