package designpatterns.behavioral.chainofresponsibilities;

public class DataFile {
    private String fileExtension;
    private String data;

    public DataFile(String fileExtension, String data) {
        this.fileExtension = fileExtension;
        this.data = data;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
