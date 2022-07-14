package ec.edu.espe.arquitectura.listaobservados.resource;

import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficantes;
import ec.edu.espe.arquitectura.listaobservados.service.NarcotraficantesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/observados")
@RequiredArgsConstructor
public class NarcotraficantesResource {
    private final NarcotraficantesService service;

    @GetMapping(path = "{sancionado}")
    public ResponseEntity<List<Narcotraficantes>> obtainBySancionados(@PathVariable String sancionado){
        try{
            return ResponseEntity.ok(this.service.obtainBySancionado(sancionado));
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
