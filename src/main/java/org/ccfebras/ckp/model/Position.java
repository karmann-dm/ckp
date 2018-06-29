package org.ccfebras.ckp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
    private Long id;

    @Column(name = "name")
    private String name;
}
