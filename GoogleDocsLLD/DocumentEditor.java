package GoogleDocsLLD;

import GoogleDocsLLD.DocumentElements.TextElement;
import GoogleDocsLLD.DocumentElements.ImageElement;
import GoogleDocsLLD.Persistance.Persistance;

public class DocumentEditor {
    private final Document document;
    private Persistance persistance; 

    public DocumentEditor(Document document, Persistance persistance) {
        if (document == null)
            throw new IllegalArgumentException("Document cannot be null");
        this.document = document;
        this.persistance = persistance;
    }

    public void setPersistance(Persistance persistance) {
        this.persistance = persistance;
    }


    public void addText(String text) {
        document.addDocument(new TextElement(text));
    }

    public void addImg(String path) {
        document.addDocument(new ImageElement(path));
    }

    public void renderDocument() {
        document.render();
    }

    public void save() {
        if (persistance == null)
            throw new IllegalStateException("No persistence strategy set");
        persistance.save(document);
    }
}