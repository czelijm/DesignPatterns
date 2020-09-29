package designpatterns.structural.decorator;

public class MainArtefact implements AbstractArtefact {
    AbstractArtefact artefact;

    public MainArtefact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " Main Icon";
    }
}
