package ml.bimdev.lesson38.classtest.task03;

class CharacterProduct {
    private Character ch;
    private boolean fileRead = false;

    boolean isProduced() {
        return ch != null;
    }

    boolean isConsumed() {
        return ch == null;
    }

    public boolean isFileRead() {
        return fileRead;
    }

    public void setFileReaded(boolean fileRead) {
        this.fileRead = fileRead;
    }

    void produce(char character) {
        ch = character;
    }

    char consume() {
        char c = ch;
        ch = null;
        return c;
    }
}
