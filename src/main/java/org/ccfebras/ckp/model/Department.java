package org.ccfebras.ckp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ccfebras.ckp.model.base.UserDateAudit;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments", uniqueConstraints = {
        @UniqueConstraint(columnNames = "short_name")
})
@AllArgsConstructor
@NoArgsConstructor
public class Department extends UserDateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "short_name")
    @Getter
    @Setter
    private String shortName;

    @Column(name = "full_name", columnDefinition = "TEXT")
    @Getter
    @Setter
    private String fullName;

    @OneToMany(mappedBy = "department")
    @Getter
    @Setter
    private List<Organization> organizations;
}
