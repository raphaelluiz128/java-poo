package celular;

import telefone.Telefone;

public class Celular extends Telefone {
    private String nome;
    private float tamanhoTela;

    public Celular(String nome, float tamanhoTela, Boolean isMObile) {
        // construtor
        //super = faz o que tem dentro de parenteses ser acessado na classe pai
        // o que vem após extends na linha 5 é a classe pai
        // na linha nove temos que passar o atribuito da classe pai 'isMobile'
        super(isMObile);
        this.tamanhoTela = tamanhoTela;
        this.nome = nome;

    }

    // ## métodos getters e setters

    public String getNome() {
        return nome;
    }

    public float getTamanhoTela() {
        // se não for void precisa de return
        return tamanhoTela;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setTamanhoTela(float tamanhoTela) {

        this.tamanhoTela = tamanhoTela;
    }

    public void mostrarPropriedades() {
        System.out.println(nome + '\n' + tamanhoTela + '\n' + isMobile);
    }

};
