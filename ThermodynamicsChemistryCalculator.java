import java.util.ArrayList;
import java.util.List;

public class ThermodynamicsChemistryCalculator {

    public static void main(String[] args) {
        List<MoleculeWithNumber> reactants = new ArrayList<>();
        List<MoleculeWithNumber> products = new ArrayList<>();
        ChemicalEquation chemicalEquation;
        
        Molecule no2 = Molecules.N_O2_g.getMolecule();
        Molecule n2o4 = Molecules.N2_O4_g.getMolecule();


        reactants.add(new MoleculeWithNumber(no2, 2));
        products.add(new MoleculeWithNumber(n2o4, 1));

        chemicalEquation = new ChemicalEquation(reactants, products);

        double deltaG = chemicalEquation.getDeltaG();

        //-6
        System.out.println(deltaG);
    }
}
