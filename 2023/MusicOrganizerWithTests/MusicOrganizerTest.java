
import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MusicOrganizerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MusicOrganizerTest
{
    /**
     * Default constructor for test class MusicOrganizerTest
     */
    public MusicOrganizerTest()
    {
    }

    @Test
    public void addFileReturnsCorrectFiletypeWhenFileIsAddedWithoutSpecifyingFileType()
    {
        MusicOrganizer unit = new MusicOrganizer();
        MusicFile result = unit.addFile("filename");
        Assert.assertEquals(result.getFileType(), FileType.Flac);
    }

    @Test
    public void addFileReturnsCorrectNameWhenFileIsAddedWithoutSpecifyingFileType()
    {
        MusicOrganizer unit = new MusicOrganizer();
        MusicFile result = unit.addFile("filename");
        Assert.assertEquals(result.getFileName(), "FILENAME");
    }

    @Test
    public void addFileReturnsNullWhenFilenameExists()
    {
        MusicOrganizer unit = new MusicOrganizer();
        unit.addFile("filename");
        MusicFile result = unit.addFile("filename");
        Assert.assertNull(result);
    }

    @Test
    public void addFileIsNotAddedToOrganizerWhenExists()
    {
        MusicOrganizer unit = new MusicOrganizer();
        unit.addFile("filename");
        unit.addFile("filename");
        Assert.assertEquals(1,unit.getNumberOfFiles());
    }
    
    @Test
    public void addFileReturnsCorrectFileTypeWhenFileTypeIsSpecified()
    {
        MusicOrganizer unit = new MusicOrganizer();
        MusicFile result = unit.addFile("filename", FileType.Mp3);
        Assert.assertEquals(result.getFileType(), FileType.Mp3);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    public void tearDown()
    {
    }
}
