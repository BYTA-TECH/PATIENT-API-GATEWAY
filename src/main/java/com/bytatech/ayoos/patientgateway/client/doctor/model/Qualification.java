package com.bytatech.ayoos.patientgateway.client.doctor.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
import java.io.Serializable;

import javax.persistence.ManyToOne;

/**
 * A Qualification.
 */ 
public class Qualification implements Serializable {

    private static final long serialVersionUID = 1L;
 
    private Long id;
 
    private String qualification;

    @ManyToOne
    @JsonIgnoreProperties("qualifications")
    private Doctor doctor;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQualification() {
        return qualification;
    }

    public Qualification qualification(String qualification) {
        this.qualification = qualification;
        return this;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Qualification doctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Qualification)) {
            return false;
        }
        return id != null && id.equals(((Qualification) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Qualification{" +
            "id=" + getId() +
            ", qualification='" + getQualification() + "'" +
            "}";
    }
}
