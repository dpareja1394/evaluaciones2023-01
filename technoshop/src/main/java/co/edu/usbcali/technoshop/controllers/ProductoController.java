package co.edu.usbcali.technoshop.controllers;

import co.edu.usbcali.technoshop.dtos.MensajeDTO;
import co.edu.usbcali.technoshop.dtos.ProductoDTO;
import co.edu.usbcali.technoshop.services.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    private ProductoService productoService;

    @GetMapping("/obtenerProductos")
    public ResponseEntity<List<ProductoDTO>> obtenerProductos() {
        return new ResponseEntity<>(productoService.obtenerProductos(), HttpStatus.OK);
    }

    @PostMapping(path = "/registrarProducto",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity registrarProducto(@RequestBody ProductoDTO productoDTO) {
        try {
            return new ResponseEntity(productoService.registrarProducto(productoDTO), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(MensajeDTO.builder().mensaje(e.getMessage()).build(), HttpStatus.BAD_REQUEST);
        }
    }


}
