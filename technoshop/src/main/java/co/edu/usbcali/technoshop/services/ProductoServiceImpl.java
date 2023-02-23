package co.edu.usbcali.technoshop.services;

import co.edu.usbcali.technoshop.dtos.ProductoDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Override
    public List<ProductoDTO> obtenerProductos() {
        return Arrays.asList(
                ProductoDTO.builder()
                        .idProducto("1")
                        .nombreProducto("Samsung Galaxy S23")
                        .precio(2500000)
                        .nombreFabricante("Samsung")
                        .descripcionProducto("Teléfono celular con tecnología 5G")
                        .build(),
                ProductoDTO.builder()
                        .idProducto("2")
                        .nombreProducto("iPhone 13")
                        .precio(4500000)
                        .nombreFabricante("Apple Inc")
                        .descripcionProducto("Teléfono celular con tecnología 5G")
                        .build()
        );
    }

    @Override
    public ProductoDTO registrarProducto(ProductoDTO productoDTO) throws Exception {
        if(productoDTO == null) {
            throw new Exception("El producto no puede estar nulo");
        }

        if(productoDTO.getIdProducto() == null || productoDTO.getIdProducto().isEmpty()) {
            throw new Exception("El id producto no puede estar nulo");
        }

        if(productoDTO.getNombreProducto() == null || productoDTO.getNombreProducto().isEmpty()) {
            throw new Exception("El nombre producto no puede estar nulo");
        }

        if(productoDTO.getPrecio() == null) {
            throw new Exception("El precio no puede estar nulo");
        }

        if(productoDTO.getNombreFabricante() == null ||
        productoDTO.getNombreFabricante().isEmpty()) {
            throw new Exception("El nombre dabricante no puede estar nulo");
        }

        if(productoDTO.getDescripcionProducto() == null ||
                productoDTO.getDescripcionProducto().isEmpty()) {
            throw new Exception("La descripción del producto no puede estar nulo");
        }
        return productoDTO;
    }
}
