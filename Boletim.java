public class Boletim {
    private double nota1;
    private double nota2;

    public Boletim(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;

    }


    public double mediaAluno(){
        System.out.println("Essa é a sua media com base nas notas anteriores: ");
        return (2 / nota1 + nota2);
    }
}

