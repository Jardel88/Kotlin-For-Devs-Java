package interoperabilidadecomjava;

import orientacaoobjetos.generics.MaxKt;

public class PessoaKotlin {
    public static void main(String[] args) {

        PersonKotlin rob = new PersonKotlin("Robert", "Martin");
        System.out.println("His name is " + rob.getFirstName());

        rob.setFirstName("Uncle Bob");
        System.out.println("His name is now " + rob.getFirstName());

        /*Acessando funcao em java, nao existe classe, apenas a funcao e gerado uma classe em byte code
         e a funcao max passa a ser como se fosse um metodo estatico,
         quando compila é adicionado o sufixo KT
         */
        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is " + maxInt);
    }
}
