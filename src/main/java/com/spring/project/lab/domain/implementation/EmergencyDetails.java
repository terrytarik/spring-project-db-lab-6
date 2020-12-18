package com.spring.project.lab.domain.implementation;

import com.spring.project.lab.domain.GeneralModelInterface;

import javax.persistence.*;

@Entity
@Table(name = "emergency_details", schema = "fedyniak_illya_db", catalog = "")
public class EmergencyDetails implements GeneralModelInterface {

    private Integer id;
    private String type;
    private String cause;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmergencyDetails that = (EmergencyDetails) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (cause != null ? !cause.equals(that.cause) : that.cause != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (cause != null ? cause.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "Emergency Details [id=" + id + ", type=" + type + ", cause=" + cause + "]";
    }

}
