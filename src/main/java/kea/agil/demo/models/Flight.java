package kea.agil.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    private char arrivalDepart;

    private String routeNo;

    private Time timeOfAD;

    @JsonManagedReference
    @ManyToOne
    Plane plane;

    @JsonManagedReference
    @ManyToOne()
    Airport airport;

    public Flight() {
    }

    public Flight(Date date, char arrivalDepart, String routeNo, Time timeOfAD, Airport airport, Plane plane) {
        this.date = date;
        this.arrivalDepart = arrivalDepart;
        this.routeNo = routeNo;
        this.timeOfAD = timeOfAD;
        this.airport = airport;
        this.plane = plane;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getArrivalDepart() {
        return arrivalDepart;
    }

    public void setArrivalDepart(char arrivalDepart) {
        this.arrivalDepart = arrivalDepart;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public Time getTimeOfAD() {
        return timeOfAD;
    }

    public void setTimeOfAD(Time timeOfAD) {
        this.timeOfAD = timeOfAD;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
