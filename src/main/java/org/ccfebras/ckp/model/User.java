package org.ccfebras.ckp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ccfebras.ckp.model.base.DateAudit;

import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
@NoArgsConstructor
@AllArgsConstructor
public class User extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private Long id;

    @Column(name = "first_name")
    @Getter
    @Setter
    private String firstName;

    @Column(name = "second_name")
    @Getter
    @Setter
    private String secondName;

    @Column(name = "last_name")
    @Getter
    @Setter
    private String lastName;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    @Getter
    @Setter
    private Organization organization;
}
