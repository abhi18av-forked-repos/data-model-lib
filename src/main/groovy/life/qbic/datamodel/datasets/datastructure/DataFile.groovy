package life.qbic.datamodel.datasets.datastructure

import groovy.transform.ToString

/**
 * A DataFile object represents a file
 * with a name, a path and a fileType
 *
 * @author: Sven Fillinger
 */
@ToString(includeNames=true) // includes property names
class DataFile implements Cloneable{

    /**
     * The file name
     */
    final private String name

    /**
     * The file path
     */
    final private String path

    /**
     * The file path
     */
    final private String fileType

    protected DataFile() {}

    protected DataFile(String name, String path, String fileType){
        this.name = name
        this.path = path
        this.fileType = fileType
    }

    /**
     * Static factory method to create DataFile objects.
     * @param name The file name
     * @param path The file path
     * @param fileType The file type
     * @return A new DataFile object
     */
    static DataFile create(String name, String path, String fileType) {
        new DataFile(name, path, fileType)
    }

    @Override
    protected DataFile clone() throws CloneNotSupportedException {
        try {
            return (DataFile) super.clone()
        } catch (CloneNotSupportedException e) {
            throw new AssertionError()
        }
    }

    @Override
    boolean equals(Object o){
        if (o == this){
            return true
        }
        if (!(o instanceof DataFile)) {
            return false
        }
        DataFile datafile = (DataFile) o
        return datafile.name == name
                && datafile.path == path
                && datafile.fileType
    }
}
