package kea.agil.demo.models;

import javax.persistence.*;

@Entity
public class Gate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int gateNo;
    @Column(nullable = false)
    private int gateSize;

    public Gate() {
    }

    public Gate(int gateNo, int gateSize) {
        this.gateNo = gateNo;
        this.gateSize = gateSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public int getGateSize() {
        return gateSize;
    }

    public void setGateSize(int gateSize) {
        this.gateSize = gateSize;
    }
}
