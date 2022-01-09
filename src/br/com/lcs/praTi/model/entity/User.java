package br.com.lcs.praTi.model.entity;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@NoArgsConstructor
public class User {

    private String name;
    private String fone;
    private String birthDate;
    private String registrationDate;
    private String lastChange;

    public User(String name, String fone, String birthDate, String registrationDate, String lastChange) {
        this.name = name;
        this.fone = fone;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.lastChange = lastChange;
    }

    @Override
    public String toString(){
        return "Nome: " + this.name
                +"\nTelefone: " + this.fone
                +"\nData de Nascimento: " + this.birthDate
                +"\nData de resgistro: " + this.registrationDate
                +"\nUltima alteração: " + this.lastChange;
    }
}
