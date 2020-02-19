package storage.types;

/**
 * @author rhau
 * FileComponent model superclass
 */
public abstract class FileComponent {
	 
    private String filename;
 
    /**
	 * @param filename
	 */
	public FileComponent(String filename) {
		this.filename = filename;
	}

	public void printFilename() {
        System.out.println(this.filename);
    }
    
    /**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	public void addFile(FileComponent newFile) throws Exception {
        throw new Exception("Não pode inserir arquivos em: "
                + this.filename + " - Não é uma pasta");
    }
 
    public void removeFile(String filename) throws Exception {
        throw new Exception("Não pode remover arquivos em: "
                + this.filename + " -Não é uma pasta");
    }
 
    public FileComponent getFile(String filename) throws Exception {
        throw new Exception("Não pode pesquisar arquivos em: "
                + this.filename + " - Não é uma pasta");
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FileComponent [filename=" + filename + "]";
	}
    
}