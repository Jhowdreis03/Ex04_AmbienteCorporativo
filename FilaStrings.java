public class FilaStrings {
    private String[] elementos;
    private int inicio, fim;
    private int tamanho;
    
    public FilaStrings(int capacidade) {
        this.elementos = new String[capacidade];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }
    
    public boolean isEmpty() {
        return this.tamanho == 0;
    }
    
    public boolean isFull() {
        return this.tamanho == this.elementos.length;
    }
    
    public boolean insert(String elemento) {
        if (this.isFull()) {
            return false;
        }
        this.elementos[this.fim] = elemento;
        this.fim = (this.fim + 1) % this.elementos.length;
        this.tamanho++;
        return true;
    }
    
    public String remove() {
        if (this.isEmpty()) {
            return null;
        }
        String elemento = this.elementos[this.inicio];
        this.inicio = (this.inicio + 1) % this.elementos.length;
        this.tamanho--;
        return elemento;
    }
    
    public int size() {
        return this.tamanho;
    }
    
    public String peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.elementos[this.inicio];
    }
}
