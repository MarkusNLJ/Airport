package kea.agil.demo.repository;

import kea.agil.demo.models.Plane;
import org.springframework.data.repository.CrudRepository;

public interface PlaneRep extends CrudRepository<Plane, Long> {
    Plane findPlaneById(Long id);
}
