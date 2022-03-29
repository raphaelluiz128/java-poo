package celular;
public class Celular {
    // variáveis nas linhas 4 e 5
    public String nome;
    public float tamanhoTela;
    
    // métodos nas linhas abaixo:
    public void atualizarPropriedades(String VNome, float vTamanhoTela)
    {
        nome = VNome;
        tamanhoTela = vTamanhoTela;
    }

    public void mostrarPropriedades()
    {
        System.out.println(nome + '\n' + tamanhoTela);

    }

};

