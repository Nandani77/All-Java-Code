import spark.Request;
import spark.Response;
import spark.Spark;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleHTTPServer {
    public static void main(String[] args) {
        Spark.port(8080);

        Spark.get("/data", (req, res) -> handleGetDataRequest(req, res));
    }

    private static String handleGetDataRequest(Request req, Response res) {
        String fileName = req.queryParams("n");
        String lineNumberParam = req.queryParams("m");

        if (fileName == null) {
            res.status(400);
            return "Error: Parameter 'n' is required.";
        }

        String filePath = "/tmp/data/" + fileName + ".txt";

        try {
            if (lineNumberParam != null) {
                int lineNumber = Integer.parseInt(lineNumberParam);
                return getSpecificLine(filePath, lineNumber);
            } else {
                return getFileContent(filePath);
            }
        } catch (IOException | NumberFormatException e) {
            res.status(500);
            return "Error: " + e.getMessage();
        }
    }

    private static String getFileContent(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static String getSpecificLine(String filePath, int lineNumber) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int currentLineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (currentLineNumber == lineNumber) {
                    return line;
                }
                currentLineNumber++;
            }
            return "Error: Line number " + lineNumber + " not found.";
        }
    }
}