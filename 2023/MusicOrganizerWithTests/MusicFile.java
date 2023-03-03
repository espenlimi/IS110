
/**
 * Write a description of class MusicFile here.
 *
 * @author Esp1
 * @version 1337
 */
public class MusicFile
{
    private String name;
    private FileType fileType;
    /**
     * Constructor for musicfile
     * @param name The file name
     * @param fileType type of file
     */
    public MusicFile(String name, FileType fileType)
    {
        this.name = name;
        this.fileType = fileType;
    }

    /**
     * Returns the name of the file in all its glory!! 
     */
    public String getFileName(){
        return name;
    }
    public FileType getFileType()
    {
        return fileType;
    }
}
