package storage;

import java.util.ArrayList;

import storage.types.FileComponent;

/**
 * @author rhau
 * Base file system
 */
public class FileComposite extends FileComponent {
	 
    private ArrayList<FileComponent> files = new ArrayList<>();
 
    /**
	 * @param filename
	 */
	public FileComposite(String filename) {
		super(filename);
	}
 
    @Override
    public void printFilename() {
        System.out.println(this.getFilename());
        for (FileComponent tempFile : files) {
            tempFile.printFilename();
        }
    }
 
    @Override
    public void addFile(FileComponent newFile) {
        this.files.add(newFile);
    }
 
    @Override
    public void removeFile(String filename) throws Exception {
        for (FileComponent tempFile : files) {
            if (tempFile.getFilename().equals(filename)) {
                this.files.remove(tempFile);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
 
    @Override
    public FileComponent getFile(String filename) throws Exception {
        for (FileComponent tempFile : files) {
            if (tempFile.getFilename().equals(filename)) {
                return tempFile;
            }
        }
        throw new Exception("Não existe este arquivo");
    }

	/**
	 * @return the files
	 */
	public ArrayList<FileComponent> getFiles() {
		return files;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FileComposite [files=" + files + "]";
	}
    
}