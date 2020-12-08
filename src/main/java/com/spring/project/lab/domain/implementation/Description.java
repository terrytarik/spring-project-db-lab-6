package com.spring.project.lab.domain.implementation;

import com.spring.project.lab.domain.GeneralModelInterface;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "description", schema = "fedyniak_illya_db", catalog = "")
public class Description implements GeneralModelInterface {
    private Integer id;
    private String shortDesc;
    private String expandedDesc;
    private EmergencyDetails emergencyDetailsByEmergencyDetailsId;

    public Description() {
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

//    @OneToMany(mappedBy = "descriptionByDescriptionId")
//    public Collection<ReceivedCall> getReceivedCallsById() {
//        return receivedCallsById;
//    }
//
//    public void setReceivedCallsById(Collection<ReceivedCall> receivedCallsById) {
//        this.receivedCallsById = receivedCallsById;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(shortDesc, that.shortDesc) &&
                Objects.equals(expandedDesc, that.expandedDesc) &&
                Objects.equals(emergencyDetailsByEmergencyDetailsId, that.emergencyDetailsByEmergencyDetailsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shortDesc, expandedDesc, emergencyDetailsByEmergencyDetailsId);
    }


    @Override
    public String toString() {
        return "Description [id=" + id + ", shortDesc=" + shortDesc + ", expandedDesc=" + expandedDesc + ", emergencyDetailsByEmergencyDetailsId=" + emergencyDetailsByEmergencyDetailsId + "]";
    }
}
