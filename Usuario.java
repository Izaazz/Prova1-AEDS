package Prova;

class Usuario {
    private String nome;
    private String email;
    private int nFotos = 0;
    private Fotos[] fotos = new Fotos[20];

    //ta pronto
    public void cadastra_foto(String link, String desc){
        
        Fotos[] novasFotos;
        Fotos novaFoto = new Fotos();
        int i;

        //Se necessário, aumenta o número de fotos
        if(this.nFotos == this.fotos.length){
            novasFotos = new Fotos[this.fotos.length+1];

			for(i = 0; i < this.nFotos; i++){
                novasFotos[i] = this.fotos[i];
            }

            this.fotos = novasFotos;
        }

        novaFoto.setLink(link);
        novaFoto.setDesc(desc);

        fotos[this.nFotos] = novaFoto;
        

        this.nFotos = this.nFotos+1;
    }

    public void altera_descricao(int n, String desc){
        this.getFoto(n).setDesc(desc);
    }

    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public Fotos getFoto(int n){
        return this.fotos[n];
    }
    public Fotos[] getFotos(){
        return this.fotos;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getNfotos(){
        return this.nFotos;
    }

}
