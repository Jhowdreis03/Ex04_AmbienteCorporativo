public class ImpressoraController {
    public static void insereDocumento(FilaStrings fila, String documento) {
        fila.insert(documento);
    }
    
    public static void imprime(FilaStrings fila) {
        if (fila.isEmpty()) {
            throw new IllegalStateException("Não há documentos na fila de impressão.");
        }
        String documento = fila.remove();
        String[] dados = documento.split(";");
        String idPc = dados[0];
        String nomeArquivo = dados[1];
        int tempoImpressao = (int) (Math.random() * 2000) + 1000;
        try {
            Thread.sleep(tempoImpressao);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("#PC: " + idPc + " - Arquivo: " + nomeArquivo);
    }
}
