import java.util.ArrayList;
import java.util.List;

public class ThermodynamicsChemistryCalculator {

    public static void main(String[] args) {
        List<MoleculeWithNumber> reactants = new ArrayList<>();
        List<MoleculeWithNumber> products = new ArrayList<>();
        ChemicalEquation chemicalEquation;

        //Create your molecules here by referring to the Molecules enum
        //Once you type Molcules, add a period and a list of molecules will show up

        //Reactants
        Molecule no = Molecules.N_O_g.getMolecule();
        Molecule nh3 = Molecules.N_H3_g.getMolecule();
        Molecule o2 = Molecules.O2_g.getMolecule();
        //Products
        Molecule no2 = Molecules.N_O2_g.getMolecule();
        Molecule h2o = Molecules.H2_O_g.getMolecule();


        //Add the reactants here
        reactants.add(new MoleculeWithNumber(nh3, 4));
        reactants.add(new MoleculeWithNumber(o2, 5));

        //Add the products here
        products.add(new MoleculeWithNumber(no2, 4));
        products.add(new MoleculeWithNumber(h2o, 6));


        chemicalEquation = new ChemicalEquation(reactants, products);

        //Change the method being called to get different values
        //Methods:
        //getDeltaH
        //getDeltaG
        //getDeltaS
        double output = chemicalEquation.getDeltaH();

        //Prints output to the console
        System.out.println(output);
    }
}
