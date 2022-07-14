package ec.edu.espe.arquitectura.listaobservados.service;

import ec.edu.espe.arquitectura.listaobservados.dao.NarcotraficantesRepository;
import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficantes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NarcotraficantesService {
    private final NarcotraficantesRepository narcotraficantesRepository;

    public List<Narcotraficantes> obtainBySancionado(String sancionado){
        return this.narcotraficantesRepository.findBySancionado(sancionado);
    }
}
