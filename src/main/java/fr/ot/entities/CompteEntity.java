package fr.ot.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "Compte", schema = "dbo", catalog = "CRKF")
public class CompteEntity {
    @Basic
    @Id
    @Column(name = "id_compte")
    private int idCompte;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompteEntity that = (CompteEntity) o;
        return idCompte == that.idCompte && Objects.equals(email, that.email) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompte, email, password);
    }

}
