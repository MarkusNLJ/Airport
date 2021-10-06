package kea.agil.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "planes")
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false)
    private boolean hasPassengeres = true;

    @Column(nullable = false)
    private boolean isClean = false;

    @Column(nullable = false)
    private boolean hasGas = false;

    @Column(nullable = false)
    private String model;

    @JsonBackReference
    @OneToMany()
    @JoinColumn(name = "iata_code")
    Set<Flight> flights;

    @Column(nullable = true)
    private String Icao;

    @Column(nullable = false)
    private char size;

    @Column(nullable = false)
    private int gateNo;


    public Plane(boolean passengers, int gateNo, boolean isClean, boolean hasGas, Set<Flight> flights, String model, String icao, char size) {
        this.hasPassengeres = passengers;
        this.isClean = isClean;
        this.hasGas = hasGas;
        this.model = model;
        this.flights = flights;
        this.Icao = icao;
        this.size = size;
        this.gateNo = gateNo;
    }


    public Plane() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isHasPassengeres() {
        return hasPassengeres;
    }

    public void setHasPassengeres(boolean passengers) {
        this.hasPassengeres = passengers;
    }

    public boolean isIsClean() {
        return isClean;
    }

    public void setIsClean(boolean clean) {
        this.isClean = clean;
    }

    public boolean isHasGas() {
        return hasGas;
    }

    public void setHasGas(boolean gas) {
        this.hasGas = gas;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }

    public String getIcao() {
        return Icao;
    }

    public void setIcao(String icao) {
        Icao = icao;
    }
}
