package Modell;

import java.net.URL;

public class LoadableStory {

    private String title;
    
    private String fileName;

    private String description;
    
    public LoadableStory() {
        super();
    }
    
    /**
     * @param title
     * @param fileName
     */
    public LoadableStory(String title, String fileName,String description) {
        super();
        this.title = title;
        this.fileName = fileName;
        this.description=description;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return title;
    }
    
    
}
