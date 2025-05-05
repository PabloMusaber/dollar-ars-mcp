package mcp.dollar.services;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mcp.dollar.dtos.DollarResponseDTO;

@Service
public class DollarService {

    private static final String DOLLAR_API_URL = "https://mercados.ambito.com/";

    private final RestTemplate restTemplate;

    public DollarService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Tool(name = "getCriptoDollarPrice", description = "Receives information about the current Cripto USD to ARS exchange rate.")
    public DollarResponseDTO getCriptoDollarInfo() {
        return restTemplate.getForObject(DOLLAR_API_URL + "dolar/dolarcripto/variacion", DollarResponseDTO.class);
    }

    @Tool(name = "getBlueDollarPrice", description = "Receives information about the current Blue USD to ARS exchange rate.")
    public DollarResponseDTO getBlueDollarInfo() {
        return restTemplate.getForObject(DOLLAR_API_URL + "dolar/informal/variacion", DollarResponseDTO.class);
    }

    @Tool(name = "getOfficialDollarPrice", description = "Receives information about the current Official USD to ARS exchange rate.")
    public DollarResponseDTO getOfficialDollarInfo() {
        return restTemplate.getForObject(DOLLAR_API_URL + "dolar/oficial/variacion", DollarResponseDTO.class);
    }

    @Tool(name = "getMEPDollarPrice", description = "Receives information about the current MEP USD to ARS exchange rate.")
    public DollarResponseDTO getMEPDollarInfo() {
        return restTemplate.getForObject(DOLLAR_API_URL + "dolarrava/mep/variacion", DollarResponseDTO.class);
    }

}