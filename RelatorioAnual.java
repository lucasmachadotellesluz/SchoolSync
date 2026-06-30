public class RelatorioAnual {
    private String  titulo;
    private String formato;

    public RelatorioAnual(String titulo, String formato){
        this.titulo = titulo;
        this.formato = formato;
    }

    public void Processar(){
        System.out.println("Processando o relatorio anual " + titulo + " no formato: ." + formato);
    }
}
