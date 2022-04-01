import telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World POO with constructor and 'herança'!");
        Telefone telefone = new Telefone(true);
        celular.Celular celularA = new celular.Celular("Raphael", 1.6f, true);
        celularA.mostrarPropriedades();
        // na linha 6 criamos a instancia de Telefone, apesar da ide apontar que essa
        // variavel não
        // esta sendo usada (telefone) ele esta sendo usada sim, porque tenhos que
        // instanciar a classe
        // antes de usar o construtor (new)

    }
}
