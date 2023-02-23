package co.edu.usbcali.technoshop.services;

import co.edu.usbcali.technoshop.dtos.ProductoDTO;

import java.util.List;

public interface ProductoService {

    List<ProductoDTO> obtenerProductos();

    ProductoDTO registrarProducto(ProductoDTO productoDTO) throws Exception;
}
