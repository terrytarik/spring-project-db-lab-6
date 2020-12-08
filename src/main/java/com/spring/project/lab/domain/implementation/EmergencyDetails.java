package com.spring.project.lab.domain.implementation;

import com.spring.project.lab.domain.GeneralModelInterface;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "emergency_details", schema = "fedyniak_illya_db", catalog = "")
public class EmergencyDetails implements GeneralModelInterface {

    private Integer id;
    private String type;
    private String cause;

    public EmergencyDetails() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "cause")
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }


//    @OneToMany(mappedBy = "emergencyDetailsByEmergencyDetailsId")
//    public Collection<Description> getDescriptionsById() {
//        return descriptionsById;
//    }
//
//    public void setDescriptionsById(Collection<Description> descriptionsById) {
//        this.descriptionsById = descriptionsById;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmergencyDetails that = (EmergencyDetails) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(cause, that.cause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, cause);
    }

    @Override
    public String toString() {
        return "Emergency Details [id=" + id + ", type=" + type + ", cause=" + cause + "]";
    }

}
