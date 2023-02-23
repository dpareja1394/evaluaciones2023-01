package co.edu.usbcali.technoshop.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class ProductoDTO {
    private String idProducto;
    private String nombreProducto;
    private Integer precio;
    private String nombreFabricante;
    private String descripcionProducto;

}
