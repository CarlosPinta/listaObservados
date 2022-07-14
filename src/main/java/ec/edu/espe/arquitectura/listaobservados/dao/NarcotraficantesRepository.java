package ec.edu.espe.arquitectura.listaobservados.dao;

import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficantes;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NarcotraficantesRepository extends MongoRepository<Narcotraficantes,String> {
    List<Narcotraficantes> findBySancionado(String sancionado);
}
