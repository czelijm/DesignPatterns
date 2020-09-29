package designpatterns.structural.decorator;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new MainArtefact( new Artefact("Main")),
                new Artefact("Demo"),
                new ErrorArtefact( new Artefact("EmailClient")),
                new Artefact("EmailProvider"),
        };


        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
