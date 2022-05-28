import br.inatel.cdg.classes.Fetin;
import br.inatel.cdg.classes.GerenciaFetin;

public class Main {
    public static void main(String[] args) {
        Fetin projeto1 = new Fetin("Projeto 1", 70.00);
        Fetin projeto2 = new Fetin("Projeto 2", 23.00);
        Fetin projeto3 = new Fetin("Projeto 3", 78.50);
        Fetin projeto4 = new Fetin("Projeto 4", 99.75);
        GerenciaFetin gerenciador = new GerenciaFetin();

        projeto3 = null;

        gerenciador.addProjeto(projeto1);
        gerenciador.addProjeto(projeto2);
        gerenciador.addProjeto(projeto3);
        gerenciador.addProjeto(projeto4);

        gerenciador.listaProjetos();
    }
}
