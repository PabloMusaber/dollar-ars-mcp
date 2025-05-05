package mcp.dollar;

import java.util.List;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mcp.dollar.services.DollarService;

@SpringBootApplication
public class DollarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DollarApplication.class, args);
	}

	@Bean
	public List<ToolCallback> dollarTools(DollarService dollarService) {
		return List.of(ToolCallbacks.from(dollarService));
	}

}
