## Dollar-ARS MCP Server

MCP server for retrieving the exchange rate of the US dollar against the Argentine peso. It provides information about:

- MEP Dollar
- Crypto Dollar
- Blue Dollar
- Official Dollar

## Tools

The server implements the following tools:

- **getCriptoDollarPrice**: Retrieves information about the current Cripto USD to ARS exchange rate.
- **getBlueDollarPrice**: Retrieves information about the current Blue USD to ARS exchange rate.
- **getOfficialDollarPrice**: Retrieves information about the current Official USD to ARS exchange rate.
- **getMEPDollarPrice**: Retrieves information about the current MEP USD to ARS exchange rate.

## Configuration

1. Clone the repository:

```bash
git clone https://github.com/PabloMusaber/dollar-ars-mcp.git
cd dollar-ars-mcp
```

2. Build the project using Maven:

```bash
mvn clean package -DskipTests
```

3. Register the server in your MCP configuration. Add the following entry to your MCP configuration file, and remember to update with your own path.

```json
"dollar-ars": {
  "command": "java",
  "args": [
    "-jar",
    "/path-to-your-local-repo/target/dollar-0.0.1-SNAPSHOT.jar"
  ]
}
```
