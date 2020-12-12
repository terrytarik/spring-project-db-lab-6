package com.spring.project.lab.domain.implementation;

import com.spring.project.lab.domain.GeneralModelInterface;

import javax.persistence.*;

@Entity
@Table(name = "crew_accepted", schema = "fedyniak_illya_db", catalog = "")
public class CrewAccepted implements GeneralModelInterface {
    private Integer id;
    private String number;
    private String numberOfCar;
    private String typeOfCar;
    private String depatureTime;
    private String arriveTime;

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
    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "number_of_car")
    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    @Basic
    @Column(name = "type_of_car")
    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Basic
    @Column(name = "depature_time")
    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }

    @Basic
    @Column(name = "arrive_time")
    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrewAccepted that = (CrewAccepted) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (numberOfCar != null ? !numberOfCar.equals(that.numberOfCar) : that.numberOfCar != null) return false;
        if (typeOfCar != null ? !typeOfCar.equals(that.typeOfCar) : that.typeOfCar != null) return false;
        if (depatureTime != null ? !depatureTime.equals(that.depatureTime) : that.depatureTime != null) return false;
        if (arriveTime != null ? !arriveTime.equals(that.arriveTime) : that.arriveTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (numberOfCar != null ? numberOfCar.hashCode() : 0);
        result = 31 * result + (typeOfCar != null ? typeOfCar.hashCode() : 0);
        result = 31 * result + (depatureTime != null ? depatureTime.hashCode() : 0);
        result = 31 * result + (arriveTime != null ? arriveTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Crew Accepted [id=" + id + ", number=" + number + ", typeOfCar=" + typeOfCar + ", depatureTime=" + depatureTime + ", arriveTime=" + arriveTime + "]";
    }

}
