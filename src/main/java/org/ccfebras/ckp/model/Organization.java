package org.ccfebras.ckp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ccfebras.ckp.model.base.UserDateAudit;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "organizations", uniqueConstraints = {
        @UniqueConstraint(columnNames = "short_name")
})
@NoArgsConstructor
@AllArgsConstructor
public class Organization extends UserDateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "info")
    @Getter
    @Setter
    private String info;

    @Column(name = "short_name")
    @Getter
    @Setter
    private String shortName;

    @Column(name = "full_name", columnDefinition = "TEXT")
    @Getter
    @Setter
    private String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    @Getter
    @Setter
    private Department department;

    @OneToMany(mappedBy = "organization")
    @Getter
    @Setter
    private List<User> users;
}
