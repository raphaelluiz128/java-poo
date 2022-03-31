package celular;
public class Celular {
    // ## variáveis nas linhas 4 e 5
    private String nome;
    private float tamanhoTela;
    
    // se um atributo é private, você não consegue usar em outros arquivos, 
    //para acessá-los você cria métodos public como os getters e setters
    
    public Celular(String nome, float tamanhoTela){
        // construtor
        this.tamanhoTela = tamanhoTela;
        this.nome = nome;
        // geralmente usamos isso para definir valores iniciais 
        // é executado após o new no arquivo que usa essa classe
        // não tem retorno
        // pode chamar outros métodos como
        // getTamanhoTela();
    }

    // ## métodos getters e setters

    public String getNome(){
        // se não for void precisa de return
        return nome;
    }

    public float getTamanhoTela(){
        // se não for void precisa de return
        return tamanhoTela;
    }

    public void setNome(String nome){
        // void não precisa de return
        // this é usado para poder repetir o nome do parâmetro aqui em baixo
        // this faz referencia ao atributo ou método interno
        this.nome = nome;
    }

    public void setTamanhoTela(float tamanhoTela){
        // void não precisa de return
        // this é usado para poder repetir o nome do parâmetro aqui em baixo
        // this faz referencia ao atributo ou método interno
        this.tamanhoTela = tamanhoTela;
    }
    
    
    // ## demais métodos nas linhas abaixo:
    
    public void atualizarPropriedades(String VNome, float vTamanhoTela)
    {
        nome = VNome;
        tamanhoTela = vTamanhoTela;
        //se for usar o this pode deixar os parâmetros com o mesmo nome dos atributos
        // após isso usar o this como no método setNome
    }

    public void mostrarPropriedades()
    {
        System.out.println(nome + '\n' + tamanhoTela);
    }

    public void mostrarPropriedadesViaParam(String nome, float tamanhoTela)
    {
        System.out.println(nome + '\n' + tamanhoTela);
    }

};

