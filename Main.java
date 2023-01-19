package Prova;

public class Main {
    public static void main (String[] args)
    {
        InstaPet insta = new InstaPet();

        insta.cadastra_usuario("Gabi", "123");
        insta.cadastra_usuario("Iza", "456");
        insta.cadastra_usuario("Dani", "789");

        insta.cadastra_foto("123", "www.ufmg.br", "gatinho preto perdido");
        insta.cadastra_foto("789", "www.pets.com", "meu amiguinho");
        insta.cadastra_foto("789", "coltec.com", "furaozinho");
        insta.cadastra_foto("456", "meusite.com", "lontrinha");
        insta.cadastra_foto("123", "site.br", "gatogato");

        insta.listar_usuarios();

        insta.listar_pets("123");
        insta.listar_pets("456");
        insta.listar_pets("789");

        insta.altera_descricao("123", 0, "nova desc");

        insta.listar_pets("123");
        
    }
}
