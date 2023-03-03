import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author Esp1
 * @version 2023.02.28
 */
public class MusicOrganizer
{

    private ArrayList<MusicFile> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {   
        files = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public MusicFile addFile(String filename)
    {
        return addFile(filename, FileType.Flac);
    }

    public MusicFile addFile(String filename, FileType fileType)
    {
        if(getFile(filename)!=null)
        {
            return null;
        }
        String upperCaseFileName = filename.toUpperCase();
        MusicFile file = new MusicFile(upperCaseFileName, fileType);
        files.add(file);
        return file;
    }

    public MusicFile getFile(String filename)
    {
        for(MusicFile file : files)
        {
            if(file.getFileName().equals(filename.toUpperCase()))
            {
                return file;
            }
        }
        return null;
    }

    public ArrayList<MusicFile> getFiles()
    {
        return files;
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

}
