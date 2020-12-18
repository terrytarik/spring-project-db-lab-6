package com.spring.project.lab.domain.implementation;

import com.spring.project.lab.domain.GeneralModelInterface;

import javax.persistence.*;

@Entity
@Table(name = "received_call", schema = "fedyniak_illya_db", catalog = "")
public class ReceivedCall implements GeneralModelInterface {
    private Integer id;
    private Description descriptionByDescriptionId;
    private String address;
    private PersonInformationReport personInformationReportByPersonInformationReportId;
    private String dateTime;
    private CrewAccepted crewAcceptedByCrewAcceptedId;

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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "datetime")
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @ManyToOne
    @JoinColumn(name = "description_id", referencedColumnName = "id", nullable = false)
    public Description getDescriptionByDescriptionId() {
        return descriptionByDescriptionId;
    }

    public void setDescriptionByDescriptionId(Description descriptionByDescriptionId) {
        this.descriptionByDescriptionId = descriptionByDescriptionId;
    }

    @ManyToOne
    @JoinColumn(name = "person_information_report_id", referencedColumnName = "id", nullable = false)
    public PersonInformationReport getPersonInformationReportByPersonInformationReportId() {
        return personInformationReportByPersonInformationReportId;
    }

    public void setPersonInformationReportByPersonInformationReportId(PersonInformationReport personInformationReportByPersonInformationReportId) {
        this.personInformationReportByPersonInformationReportId = personInformationReportByPersonInformationReportId;
    }

    @ManyToOne
    @JoinColumn(name = "crew_accepted_id", referencedColumnName = "id", nullable = false)
    public CrewAccepted getCrewAcceptedByCrewAcceptedId() {
        return crewAcceptedByCrewAcceptedId;
    }

    public void setCrewAcceptedByCrewAcceptedId(CrewAccepted crewAcceptedByCrewAcceptedId) {
        this.crewAcceptedByCrewAcceptedId = crewAcceptedByCrewAcceptedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReceivedCall that = (ReceivedCall) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Received Call [id=" + id + ", descriptionByDescriptionId=" + descriptionByDescriptionId + ", address=" + address + ", personInformationReportByPersonInformationReportId=" + personInformationReportByPersonInformationReportId + ", dateTime=" + dateTime + "]";
    }
}
