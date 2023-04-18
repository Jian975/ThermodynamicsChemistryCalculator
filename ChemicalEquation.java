public class ChemicalEquation {

    MoleculeWithNumber[] reactants, products;

    public ChemicalEquation(MoleculeWithNumber[] reactants, MoleculeWithNumber[] products){

        this.reactants = reactants;
        this.products = products;

    }

    public double getDeltaH(){

        double reactantsDeltaH = 0.0;
        double productsDeltaH = 0.0;

        for (MoleculeWithNumber moleculeWithNumber : reactants){

            //If there's an undefined value, return the 404 error message
            if(moleculeWithNumber.getMolecule().getDeltaG() == 404.0) {
                return 404.0;
            }

            reactantsDeltaH += (moleculeWithNumber.getMolecule().getDeltaH() * moleculeWithNumber.getNumberOfMolecule());
        }

        for(MoleculeWithNumber moleculeWithNumber : products) {

            //If there's an undefined value, return the 404 error message
            if(moleculeWithNumber.getMolecule().getDeltaG() == 404.0) {
                return 404.0;
            }

            productsDeltaH += (moleculeWithNumber.getMolecule().getDeltaH() * moleculeWithNumber.getNumberOfMolecule());
        }

        return productsDeltaH - reactantsDeltaH;
    }

    public double getDeltaG(){

        double reactantsDeltaG = 0.0;
        double productsDeltaG = 0.0;

        for (MoleculeWithNumber moleculeWithNumber : reactants){

            //If there's an undefined value, return the 404 error message
            if(moleculeWithNumber.getMolecule().getDeltaG() == 404.0) {
                return 404.0;
            }

            reactantsDeltaG += (moleculeWithNumber.getMolecule().getDeltaG() * moleculeWithNumber.getNumberOfMolecule());
        }

        for(MoleculeWithNumber moleculeWithNumber : products) {

            //If there's an undefined value, return the 404 error message
            if(moleculeWithNumber.getMolecule().getDeltaG() == 404.0) {
                return 404.0;
            }

            productsDeltaG += (moleculeWithNumber.getMolecule().getDeltaG() * moleculeWithNumber.getNumberOfMolecule());
        }

        return productsDeltaG - reactantsDeltaG;
    }

    public double getDeltaS(){

        double reactantsDeltaS = 0.0;
        double productsDeltaS = 0.0;

        for (MoleculeWithNumber moleculeWithNumber : reactants){

            //If there's an undefined value, return the 404 error message
            if(moleculeWithNumber.getMolecule().getDeltaS() == 404.0) {
                return 404.0;
            }

            reactantsDeltaS += (moleculeWithNumber.getMolecule().getDeltaS() * moleculeWithNumber.getNumberOfMolecule());
        }

        for(MoleculeWithNumber moleculeWithNumber : products) {

            //If there's an undefined value, return the 404 error message
            if(moleculeWithNumber.getMolecule().getDeltaS() == 404.0) {
                return 404.0;
            }

            productsDeltaS += (moleculeWithNumber.getMolecule().getDeltaS() * moleculeWithNumber.getNumberOfMolecule());
        }
        return productsDeltaS - reactantsDeltaS;
    }

    public boolean isReactionSpontaneous() {
        //If delta G is negative, the reaction is spontaneous
        return getDeltaG() < 0;
    }
}
