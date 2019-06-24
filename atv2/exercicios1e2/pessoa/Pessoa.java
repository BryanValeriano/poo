package pessoa;

public class Pessoa {
    String nome;
    String telefone;
    String email;

    public boolean equals(Pessoa tmp) {
        if(tmp.nome.equals(nome) && tmp.telefone.equals(telefone) && tmp.email.equals(email))
            return true;
        else return false;
    }

    public Pessoa(String nome, String telefone, String email) {
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
    } 

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNome(String nome) {
        if(nome.equals("")) return;
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        if(telefone.equals("")) return;
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        if(email.equals("")) return;
        this.email = email;
    }

    public void alteraEmailTelefone(String email, String telefone) {
        setEmail(email);
        setTelefone(telefone);
    }

    public void imprimeDados() {
        System.out.println(getNome());
        System.out.println(getTelefone());
        System.out.println(getEmail());
        System.out.println();
    }
}

