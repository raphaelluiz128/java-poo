public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World POO with gettes and setters!");
        float tamanhoTela;
        String nome;
        celular.Celular celularA = new celular.Celular();
        celularA.setNome("Xperia2");
        celularA.setTamanhoTela(7.2f);
        // as linhas 5 e 6 preenchem os dados do celularA através de métodos set

        nome = celularA.getNome();
        tamanhoTela = celularA.getTamanhoTela();
        //as linhas 11 e 12 usam os métodos para obtermos os dados informados e podermos usar em variáveis 

        celularA.mostrarPropriedadesViaParam(nome, tamanhoTela);
        // a linha 15 mostra o uso de um método passando parametros (nome e tamanhoTela)
    }
}
