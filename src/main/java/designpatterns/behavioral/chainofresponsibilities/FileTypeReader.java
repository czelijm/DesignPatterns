package designpatterns.behavioral.chainofresponsibilities;

public class FileTypeReader extends Handler  {
    private String extensionType;

    public FileTypeReader(String extensionType, Handler next) {
        super(next);
        this.extensionType = extensionType;
    }

    public FileTypeReader(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(DataFile d) {
        if (this.extensionType != d.getFileExtension()) return false;
        System.out.println(this.extensionType + " file processing...");
        System.out.println("success!");
        return true;
    }

}
