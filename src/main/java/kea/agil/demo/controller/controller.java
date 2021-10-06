package kea.agil.demo.controller;

import kea.agil.demo.models.Plane;
import kea.agil.demo.service.PlaneService;
import org.springframework.web.bind.annotation.GetMapping;
import kea.agil.demo.repository.PlaneRep;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {

    private PlaneService planeService;
    public controller(PlaneService planeService){
    this.planeService = planeService;
    }

    @GetMapping("")
    public ArrayList<Plane> planeList(){
        return planeService.getAllPlanes();
    }

    @PostMapping("/addPlane")
    public Plane addPlane(@RequestBody Plane plane){
        return planeService.savePlane(plane);
    }



}
