public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World POO with constructor!");
        // após criar o método construtor na classe celular no arquivo celular.java, temos que 
        // informar quais os valores que serão utilizados lá no método construtor
        // por isso isso aqui terá que ser alterado  celular.Celular celularA = new celular.Celular();
        celular.Celular celularA = new celular.Celular("Raphael" , 1.6f);
        celularA.mostrarPropriedades();


    }
}
