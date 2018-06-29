package org.ccfebras.ckp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ccfebras.ckp.model.base.UserDateAudit;

import javax.persistence.*;

@Entity
@Table(name = "positions", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name")
})
@NoArgsConstructor
@AllArgsConstructor
public class Position extends UserDateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;
}
