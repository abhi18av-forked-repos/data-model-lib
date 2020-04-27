package life.qbic.datamodel.datasets.datastructure.folders.nanopore

import life.qbic.datamodel.datasets.datastructure.files.FastQFile

/**
 * A class that is a special case of a BarcodedFolder.
 *
 * Its children contains elements of Fast5File.class objects
 *
 * @author: Sven Fillinger
 */
class FastQFolder extends BarcodedFolder {

    protected FastQFolder() {}

    protected FastQFolder(String name, String path, List<FastQFile> children) {
        super(name, path, children)
    }

    static FastQFolder create(String name, String path, List<FastQFile> children) {
        new FastQFolder(name, path, children)
    }

}
