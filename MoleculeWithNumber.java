public class MoleculeWithNumber{
    
    private Molecule molecule;
    private int numberOfMolecule;

    MoleculeWithNumber(Molecule molecule, int numberOfMolecule){
        this.molecule = molecule;
        this.numberOfMolecule = numberOfMolecule;
    }

    Molecule getMolecule() {
        return molecule;
    }

    int getNumberOfMolecule() {
        return numberOfMolecule;
    }
}
