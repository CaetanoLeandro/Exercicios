package br.com.lcs.praTi.model.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@ToString
public class Student extends User {

    private String finalGrade;

    public Student(String name, String fone, String birthDate,
                   String registrationDate, String lastChange, String finalGrade) {
        super(name, fone, birthDate, registrationDate, lastChange);
        this.finalGrade = finalGrade;
    }
}
