package classes;

public class Usuario {
    String nome;
    String email;
    public boolean equals(Object obijeto) {
        if (obijeto instanceof Usuario) {
            Usuario outro = (Usuario) obijeto;
boolean nomeIgual = outro.nome.equals(this.nome);
boolean emailIgual = outro.email.equals(this.email);
return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
    public int hashCode() {
return 0;
    }
}
