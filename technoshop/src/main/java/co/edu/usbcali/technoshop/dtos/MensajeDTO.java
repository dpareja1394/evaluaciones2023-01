package co.edu.usbcali.technoshop.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MensajeDTO {
    private String mensaje;
}