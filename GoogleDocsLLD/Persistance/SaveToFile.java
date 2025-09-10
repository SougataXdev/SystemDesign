package GoogleDocsLLD.Persistance;

import GoogleDocsLLD.Document;

public class SaveToFile extends Persistance {
    

    @Override
    public void save(Document document){
        System.out.println("Saving the document in the file");
    }
}
