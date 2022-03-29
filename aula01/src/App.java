public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World POO!");
        celular.Celular celularA = new celular.Celular();
        celularA.atualizarPropriedades("Xperia2", 6.2f);
        // a linha acima preenche os dados do celularA através de um método lá da classe
        // celularA.nome = "Xperia2";
        // celularA.tamanhoTela = 6.2f;
        // as linhas 7 e 8 são para preencher as propriedades do celular sem usar o método atualizarPropriedades
         //basta descomentar as linhas 7 e 8 e comentar a linha 5 que o resultado é o mesmo. 
        celularA.mostrarPropriedades();
        //a linha de cima usa o método de mostrar o que preenchemos no celular
    }
}
