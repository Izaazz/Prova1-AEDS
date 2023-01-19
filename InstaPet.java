package Prova;

class InstaPet {

    Usuario usuarios[] = new Usuario[20];
    private int nUsuarios = 0;


    public void cadastra_usuario(String nome, String email){
        
        Usuario novoUsuario = new Usuario();

        novoUsuario.setNome(nome);
        novoUsuario.setEmail(email);

        usuarios[this.nUsuarios] = novoUsuario;

        this.nUsuarios++;
    }

    public void cadastra_foto(String email, String link, String desc){


        for(Usuario x : this.usuarios){
            if(x != null){
                if(x.getEmail() == email){
                    x.cadastra_foto(link, desc);
                }
            }
        }
        
    }

    public int qnt_pets(String email){
        for(Usuario x : this.usuarios){
            if(x != null){
                if(x.getEmail() == email){
                    return x.getNfotos();
                }
            }
        }
        return 0;
    }

    public void listar_pets(String email){

    int i;

    System.out.println("\n --- Lista de pets --- \n");

        for(Usuario x : this.usuarios){
            if(x != null){
                if(x.getEmail() == email){
                    System.out.println("-> Fotos de " + x.getNome());
                    for(i = 0; i < x.getNfotos(); i++){
                        System.out.println();
                        Fotos tmp = x.getFoto(i);
                        System.out.println("URL: " + tmp.getLink() + "\nDesc: " + tmp.getDesc());
                    }
                }
            }
        }
    }
    

    public void listar_usuarios(){
        int i;

        System.out.println("\n --- Lista de usuarios --- ");

        for(i = 0; i<this.nUsuarios; i++){
            if(this.usuarios[i] != null){
                System.out.println("\nNome: " + this.usuarios[i].getNome() + "\nEmail:" + this.usuarios[i].getEmail());
            }
        }

    }

    public void altera_descricao(String email, int n, String desc){
        for(Usuario x : this.usuarios){
            if(x != null){
                if(x.getEmail() == email){
                        x.altera_descricao(n, desc);
                }
            }
        }
    }

    public int qnt_usuarios(){
        return nUsuarios;
    }

    public int getnUsuarios() {
        return nUsuarios;
    }

}
