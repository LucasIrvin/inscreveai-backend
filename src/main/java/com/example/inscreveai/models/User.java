package com.example.inscreveai.models;

import com.example.inscreveai.models.enums.UserProfileEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "EMAIL", nullable = false, unique = true)
    @NotNull(message = "O login é obrigatório.")
    @Size(min = 5, max = 20)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    @NotNull(message = "A senha é obrigatória.")
    @Size(min = 5, max = 20)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_PROFILE_ENUM", nullable = false)
    @NotNull
    private UserProfileEnum userProfileEnum;

    /*// Relacionamento com a entidade Pessoa (1:1)
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;*/

    /*// Relacionamento com a entidade Transacao (1:N)
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Transacao> transacoes;  // Lista de transações associadas ao usuário*/

    /*// Relacionamento com a entidade Evento (M:N)
    @ManyToMany
    @JoinTable(
            name = "usuario_evento",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "evento_id")
    )*/

    /*private List<Evento> eventos;  // Lista de eventos nos quais o usuário está inscrito ou organiza*/

}
