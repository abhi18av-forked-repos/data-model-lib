package life.qbic.datamodel.datasets.datastructure.files.nanopore

import life.qbic.datamodel.datasets.datastructure.files.DataFile

/**
 * A specialisation of a DataFile, represents an Oxford Nanopore fast5 file
 *
 * @author: Sven Fillinger
 */
class Fast5File extends DataFile{

    final private static String FILE_TYPE = "fast5"

    protected Fast5File(String name, String path, String fileType) {
       super(name, path, fileType)
    }

    static Fast5File create(String name, String path) {
        return new Fast5File(name, path, FILE_TYPE)
    }

}
