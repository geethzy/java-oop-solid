import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

interface LineReader {
    List<String> getLines();
}

interface DatabaseReader {
    String getDatabaseName();
}

class FileReader implements LineReader {
    private String file;

    public FileReader(String file) {
        this.file = file;
    }

    @Override
    public List<String> getLines() {
        try {
            return Files.readAllLines(Path.of(file));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class RecordProcessor {
    private LineReader lineReader;

    public RecordProcessor(LineReader lineReader) {
        this.lineReader = lineReader;
    }

    public void run() {
        for (String line : lineReader.getLines()) {
            processLine(line);
        }
    }

    private void processLine(String line) {
        // TODO: Add your logic to process a single line
    }
}