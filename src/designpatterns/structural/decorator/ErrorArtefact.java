package designpatterns.structural.decorator;

public class ErrorArtefact implements AbstractArtefact {
    AbstractArtefact artefact;

    public ErrorArtefact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " Error Icon";
    }
}
