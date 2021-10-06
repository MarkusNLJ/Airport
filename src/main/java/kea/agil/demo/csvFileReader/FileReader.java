package kea.agil.demo.csvFileReader;

import kea.agil.demo.models.Plane;
import kea.agil.demo.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReader {

    @Autowired
    private PlaneService planeService;
    private Scanner scanner;

    public void insertData(){
        ArrayList<Plane> allPlanes = new ArrayList<>();
    try {
        scanner = new Scanner(new java.io.FileReader(""));
    scanner.nextLine();
    while (scanner.hasNextLine()){
    String readline = scanner.nextLine();
    Scanner seperateLine = new Scanner(readline).useDelimiter(";");


    }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }
}
