package mcp.dollar.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DollarResponseDTO {
    private String compra;
    private String venta;
    private String fecha;
    private String variacion;

    @JsonProperty("class-variacion")
    private String classVariacion;

    @JsonProperty("valor_cierre_ant")
    private String valorCierreAnt;
}
