public enum Molecules {
    //If any properties are unknown, the value 404 is passed in, as 404 stands for resource not found

    //Aluminium
    Al_s(new Molecule(0.0, 0.0, 28.0), "Al(s)"),
    Al2_O3_s(new Molecule(-1676.0, -1582.0, 51.0), "Al2O3(s)"),
    Al_OH_3_s(new Molecule(-1277.0, 404.0, 404.0), "Al(OH)3(s)"),
    Al_Cl3_s(new Molecule(-704.0, -629.0, 111.0), "AlCl3(s)"),

    //Barium
    Ba_s(new Molecule(0.0, 0.0, 67.0), "Ba(s)"),
    Ba_C_O3_s(new Molecule(-1219.0, -1139.0, 112.0), "BaCO3(s)"),
    Ba_O_s(new Molecule(-582.0, -552.0, 70.0), "BaO(s)"),
    Ba_OH_2_s(new Molecule(-946.0, 404.0, 404.0), "Ba(OH)2(s)"),
    Ba_S_O4_s(new Molecule(-1465.0, -1353.0, 132.0), "BaSO4(s)"),

    //Beryllium
    Be_s(new Molecule(0.0, 0.0, 10.0), "Be(s)"),
    Be_O_s(new Molecule(-599.0, -569.0, 14.0), "BeO(s)"),
    Be_OH_2_s(new Molecule(-904.0, -815.0, 47.0), "Be(OH)2(s)"),

    //Bromine
    Br2_l(new Molecule(0.0, 0.0, 152.0), "Br2(l)"),
    Br2_g(new Molecule(31.0, 3.0, 245.0), "Br2(g)"),
    Br2_aq(new Molecule(-3.0, 4.0, 130.0), "Br2(aq)"),
    Br_1_minus_aq(new Molecule(-121.0, -104.0, 82.0), "Br^-(aq)"),
    H_Br_g(new Molecule(-36.0, -53.0, 199.0), "HBr(g)"),

    //Cadmium
    Cd_s(new Molecule(0.0, 0.0, 52.0), "Cd(s)"),
    Cd_O_s(new Molecule(-258.0, -228.0, 55.0), "CdO(s)"),
    Cd_OH_2_s(new Molecule(-561.0, -474.0, 96.0), "Cd(OH)2(s)"),
    Cd_S_s(new Molecule(-162.0, -156.0, 65.0), "CdS(s)"),
    Cd_S_O4_s(new Molecule(-935.0, -823.0, 123.0), "CdSO4(s)"),

    //Calcium
    Ca_s(new Molecule(0.0, 0.0, 41.0), "Ca(s)"),
    Ca_C2_s(new Molecule(-63.0, -68.0, 70.0), "CaC2(s)"),
    Ca_C_O3_s(new Molecule(-1207.0, -1129.0, 93.0), "CaCO3(s)"),
    Ca_O_s(new Molecule(-635.0, -604.0, 40.0), "CaO(s)"),
    Ca_OH_2_s(new Molecule(-987.0, -899.0, 83.0), "Ca(OH)2(s)"),
    Ca3_PO4_2_s(new Molecule(-4126.0, -3890.0, 241.0), "Ca3(PO4)2(s)"),
    Ca_S_O4(new Molecule(-1433.0, -1320.0, 107.0), "CaSO4(s)"),
    Ca_Si_O3(new Molecule(-1630.0, -1550.0, 84.0), "CaSiO3(s)"),

    //Carbon
    C_s_grpahite(new Molecule(0.0, 0.0, 6.0), "C(s) graphite"),
    C_s_diamond(new Molecule(2.0, 3.0, 2.0), "C(s) diamond"),
    C_O_g(new Molecule(-110.5, -137.0, 198.0), "Co(g)"),
    C_O2_g(new Molecule(-393.5, -394.0, 214.0), "CO2(g)"),
    C_H4_g(new Molecule(-75.0, -51.0, 186.0), "CH4(g)"),
    C_H3_O_H_g(new Molecule(-201.0, -163.0, 240.0), "CH3OH(g)"),
    C_H3_O_H_l(new Molecule(-239.0, -166.0, 127.0), "CH3OH(l)"),
    H2_C_O_g(new Molecule(-116.0, -110.0, 219.0), "H2CO(g)"),
    H_C_O_O_H_g(new Molecule(-363.0, -351.0, 249.0), "HCOOH(g)"),
    H_C_N_g(new Molecule(135.1, 125.0, 202.0), "HCN(g)"),
    C2_H2_g(new Molecule(227.0, 209.0, 201.0), "C2H2(g)"),
    C2_H4_g(new Molecule(52.0, 68.0, 219.0), "C2H4(g)"),
    C_H3_C_H_O_g(new Molecule(-166.0, -219.0, 250.0), "CH3CHO(g)"),
    C2_H5_O_H_l(new Molecule(-278.0, -175.0, 161.0), "C2H5OH(l)"),
    C2_H6_g(new Molecule(-84.7, -32.9, 229.5), "C2H6(g)"),
    C3_H6_g(new Molecule(20.9, 62.7, 266.9), "C3H6(g)"),
    C3_H8_g(new Molecule(-104.0, -24.0, 270.0), "C3H8(g)"),
    C2_H4_O_g(new Molecule(-53.0, -13.0, 242.0), "C2H4O(g)");



    final Molecule molecule;
    final String name;
    
    Molecules(Molecule molecule, String name){
        this.molecule = molecule;
        this.name = name;
    }


}