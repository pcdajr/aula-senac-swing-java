import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cliente{
    
    private String nome;
    private String email;
    private String idade;
        
    public String salvar() throws IOException{
        File arquivo = new File("C:\\Users\\Paulo\\Desktop\\Nova pasta\\Cliente.txt");
        
        if(arquivo.exists() != true){
            arquivo.createNewFile();
            FileWriter write = new FileWriter(arquivo);
            write.write(this.nome+" - "+this.email+" - "+this.idade);
            write.flush();
            write.close();
        }
        return "Sucesso ao cadastrar";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

        
}