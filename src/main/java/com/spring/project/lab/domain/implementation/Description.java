package com.spring.project.lab.domain.implementation;

import com.spring.project.lab.domain.GeneralModelInterface;

import javax.persistence.*;

@Entity
@Table(name = "description", schema = "fedyniak_illya_db", catalog = "")
public class Description implements GeneralModelInterface {
    private Integer id;
    private String shortDesc;
    private String expandedDesc;
    private EmergencyDetails emergencyDetailsByEmergencyDetailsId;

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
    @Column(name = "short_desc")
    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Basic
    @Column(name = "expanded_desc")
    public String getExpandedDesc() {
        return expandedDesc;
    }

    public void setExpandedDesc(String expandedDesc) {
        this.expandedDesc = expandedDesc;
    }

    @ManyToOne
    @JoinColumn(name = "emergency_details_id", referencedColumnName = "id", nullable = false)
    public EmergencyDetails getEmergencyDetailsByEmergencyDetailsId() {
        return emergencyDetailsByEmergencyDetailsId;
    }

    public void setEmergencyDetailsByEmergencyDetailsId(EmergencyDetails emergencyDetailsByEmergencyDetailsId) {
        this.emergencyDetailsByEmergencyDetailsId = emergencyDetailsByEmergencyDetailsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Description that = (Description) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (shortDesc != null ? !shortDesc.equals(that.shortDesc) : that.shortDesc != null) return false;
        if (expandedDesc != null ? !expandedDesc.equals(that.expandedDesc) : that.expandedDesc != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (shortDesc != null ? shortDesc.hashCode() : 0);
        result = 31 * result + (expandedDesc != null ? expandedDesc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Description [id=" + id + ", shortDesc=" + shortDesc + ", expandedDesc=" + expandedDesc + ", emergencyDetailsByEmergencyDetailsId=" + emergencyDetailsByEmergencyDetailsId + "]";
    }
}
