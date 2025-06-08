import net.salesianos.file_options.fusion_files.FusionFiles;
import net.salesianos.file_options.get_files.GetFiles;
import net.salesianos.file_options.persistence_files.PersistenceFiles;
import net.salesianos.file_options.save_files.SaveFiles;
import net.salesianos.tables.Table;

public class App {
    public static void main(String[] args) throws Exception {

        // SaveFiles.createFile();

        // GetFiles.getFileContent();

        // FusionFiles.createFile();

        // FusionFiles.fusionFilesContent();

        // PersistenceFiles.createFile();

        // PersistenceFiles.saveTable(new Table("Blanco", 3));
        // PersistenceFiles.saveTable(new Table("Marfil", 4));

        PersistenceFiles.getTables();
    }
}
