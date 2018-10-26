package com.agus.f.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Userdata.
 */
@Entity
@Table(name = "userdata")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Userdata implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(unique = true)
    private Jhi_user jhi_user;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Userdata name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jhi_user getJhi_user() {
        return jhi_user;
    }

    public Userdata jhi_user(Jhi_user jhi_user) {
        this.jhi_user = jhi_user;
        return this;
    }

    public void setJhi_user(Jhi_user jhi_user) {
        this.jhi_user = jhi_user;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Userdata userdata = (Userdata) o;
        if (userdata.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userdata.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Userdata{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
