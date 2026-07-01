import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean sair = true;
        List<Estudante> listaEstudantes = new ArrayList<>();
        List<Boletim> listaBoletins = new ArrayList<>();
        List<Frequencia>listaFrequencias = new ArrayList<>();

        Estudante estudante1 = new Estudante( "Lucas", 103304858, true);
        Boletim boletim1 = new Boletim(9, 10);
        Frequencia frequencia1 = new Frequencia(0);


        Estudante estudante2 = new Estudante( "Thiago", 707240505, true);
        Boletim boletim2 = new Boletim(2, 5);
        Frequencia frequencia2 = new Frequencia(0);

        Estudante estudante3 = new Estudante( "Moisés", 395869700, false);
        Boletim boletim3 = new Boletim(6, 8);
        Frequencia frequencia3 = new Frequencia(0);





        if(estudante1.mensalidadeDia == true){
            System.out.println();
        }


        }
    }