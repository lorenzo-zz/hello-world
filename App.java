public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Geraldo";
        pessoa.idade = 34;

        System.out.println("Nome: " + pessoa.nome + "\nIdade: " + pessoa.idade);
    }
}
