public class Teste {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica();
        PessoaJuridica pessoa2 = new PessoaJuridica();

        pessoa1.setNome("Fulano");
        pessoa1.setEmail("fulano@email.com");

        pessoa2.setNome("Ciclano");
        pessoa2.setEmail("ciclano@email.com");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}
