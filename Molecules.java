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
    C2_H4_O_g(new Molecule(-53.0, -13.0, 242.0), "C2H4O(g)"),
    C_H2_C_H_C_N_g(new Molecule(185.0, 195.4, 274.0), "CH2=CHCN(g)"),
    C_H3_C_O_O_H_l(new Molecule(-484.0, -389.0, 169.0), "CH3COOH(l)"),
    C6_H12_O6_s(new Molecule(-1275.0, -911.0, 212.0), "C6H12O6(s)"),
    C_Cl4(new Molecule(-135.0, -65.0, 216.0), "CCl4"),

    //Chlorine
    Cl2_g(new Molecule(0.0, 0.0, 223.0), "Cl2(g)"),
    Cl2_aq(new Molecule(-23.0, 7.0, 121.0), "Cl2(aq)"),
    Cl_1_minus_aq(new Molecule(-167.0, -131.0, 57.0), "Cl^-(aq)"),
    H_Cl_g(new Molecule(-92.0, -95.0, 187.0), "HCl(g)"),

    //Chromium
    Cr_s(new Molecule(0.0, 0.0, 24.0), "Cr(s)"),
    Cr2_O3_s(new Molecule(-1128.0, -1047.0, 81.0), "Cr2O3(s)"),
    Cr_O3_s(new Molecule(-579.0, -502.0, 72.0), "CrO3(s)"),

    //Copper
    Cu_s(new Molecule(0.0, 0.0, 33.0), "Cu(s)"),
    Cu_C_O3_s(new Molecule(-595.0, -518.0, 88.0), "CuCO3(s)"),
    Cu2_O_s(new Molecule(-179.0, -148.0, 93.0), "Cu2O(s)"),
    Cu_O_s(new Molecule(-156.0, -128.0, 43.0), "CuO(s)"),
    Cu_OH_2_s(new Molecule(-450.0, -372.0, 108.0), "Cu(OH)2(s)"),
    Cu_S_s(new Molecule(-49.0, -49.0, 67.0), "CuS(s)"),

    //Fluorine
    F2_g(new Molecule(0.0, 0.0, 203.0), "F2(g)"),
    F2_aq(new Molecule(-333.0, -279.0, -14.0), "F2(aq)"),
    H_F_g(new Molecule(-271.0, -273.0, 174.0), "HF(g)"),

    //Hydrogen
    H2_g(new Molecule(0.0, 0.0, 131.0), "H2(g)"),
    H_g(new Molecule(217.0, 203.0, 115.0), "H(g)"),
    H_1_plus_aq(new Molecule(0.0, 0.0, 0.0), "H+(aq)"),
    O_H_1_minus_aq(new Molecule(-230.0, -157.0, -11.0), "OH-(aq)"),
    H2_O_l(new Molecule(-286.0, -237.0, 70.0), "H2O(l)"),
    H2_O_g(new Molecule(-242.0, -229.0, 189.0), "H2O(g)"),

    //Iodine
    I2_s(new Molecule(0.0, 0.0, 116.0), "I2(s)"),
    I2_g(new Molecule(62.0, 19.0, 261.0), "I2(g)"),
    I2_aq(new Molecule(23.0, 16.0, 137.0), "I2(aq)"),
    I_1_minus_aq(new Molecule(-55.0, -52.0, 106.0), "I-(aq)"),

    //Iron
    Fe_s(new Molecule(0.0, 0.0, 27.0), "Fe(s)"),
    Fe3_C_s(new Molecule(21.0, 15.0, 108.0), "Fe3C(s)"),
    Wustite(new Molecule(-264.0, -240.0, 59.0), "Fe0.95O(s) (wustite)"),
    Fe_O(new Molecule(-272.0, -255.0, 61.0), "FeO"),
    Fe3_O4_s_magnetite(new Molecule(-1117.0, -1013.0, 146.0), "Fe3O4(s) (magnetite)"),
    Fe2_O3_s_hematite(new Molecule(-826.0, -740.0, 90.0), "Fe2O3(s) (hematite)"),
    Fe_S_s(new Molecule(-95.0, -87.0, 67.0), "FeS(s)"),
    Fe_S2_s(new Molecule(-178.0, -166.0, 53.0), "FeS2(s)"),
    Fe_S_O4_s(new Molecule(-929.0, -825.0, 121.0), "FeSO4(s)"),

    //Lead
    Pb_s(new Molecule(0.0, 0.0, 65.0), "Pb(s)"),
    Pb_O2_s(new Molecule(-277.0, -217.0, 69.0), "PbO2(s)"),
    Pb_S_s(new Molecule(-100.0, -99.0, 91.0), "PbS(s)"),
    Pb_S_O4_s(new Molecule(-920.0, -813.0, 149.0), "PbSO4(s)"),

    //Magnesium
    Mg_s(new Molecule(0.0, 0.0, 33.0), "Mg(s)"),
    Mg_C_O3_s(new Molecule(-1113.0, -1029.0, 66.0), "MgCO3(s)"),
    Mg_O_s(new Molecule(-602.0, -569.0, 27.0), "MgO(s)"),
    Mg_OH_2_s(new Molecule(-925.0, -834.0, 64.0), "Mg(OH)2(s)"),

    //Manganese
    Mn_s(new Molecule(0.0, 0.0, 32.0), "Mn(s)"),
    Mn_O_s(new Molecule(-385.0, -363.0, 60.0), "MnO(s)"),
    Mn3_O4_s(new Molecule(-1387.0, -1280.0, 149.0), "Mn3O4(s)"),
    Mn2_O3_s(new Molecule(-971.0, -893.0, 110.0), "Mn2O3(s)"),
    Mn_O2_s(new Molecule(-521.0, -466.0, 53.0), "MnO2(s)"),
    Mn_O4_1_minus_aq(new Molecule(-543.0, -449.0, 190.0), "MnO4-(aq)"),

    //Mercury
    Hg_l(new Molecule(0.0, 0.0, 76.0), "Hg(l)"),
    Hg2_Cl2_s(new Molecule(-265.0, -211.0, 196.0), "Hg2Cl2(s)"),
    Hg_Cl2_s(new Molecule(-230.0, -184.0, 144.0), "HgCl2(s)"),
    Hg_O_s(new Molecule(-90.0, -59.0, 70.0), "HgO(s)"),
    Hg_S_s(new Molecule(-58.0, -49.0, 78.0), "HgS(s)"),

    //Nickel
    Ni_s(new Molecule(0.0, 0.0, 30.0), "Ni(s)"),
    Ni_Cl2_s(new Molecule(-316.0, -272.0, 107.0), "NiCl2(s)"),
    Ni_O_s(new Molecule(-241.0, -213.0, 38.0), "NiO(s)"),
    Ni_OH_2_s(new Molecule(-538.0, -453.0, 79.0), "Ni(OH)2(s)"),
    Ni_S_s(new Molecule(-93.0, -90.0, 53.0), "NiS(s)"),

    //Nitrogen
    N2_g(new Molecule(0.0, 0.0, 192.0), "N2(g)"),
    N_H3_g(new Molecule(-46.0, -17.0, 193.0), "NH3(s)"),
    N_H3_aq(new Molecule(-80.0, -27.0, 111.0), "NH3(aq)"),
    N_H4_1_plus_aq(new Molecule(-132.0, -79.0, 113.0), "NH4+(aq)"),
    N_O_g(new Molecule(34.0, 52.0, 240.0), "NO2(g)"),
    N_O2_g(new Molecule(34.0, 52.0, 240.0), "NO2(g)"),
    N2_O_g(new Molecule(82.0, 104.0, 220.0), "N2O(g)"),
    N2_O4_g(new Molecule(10.0, 98.0, 304.0), "N2O4(g)"),
    N2_O4_l(new Molecule(-20.0, 97.0, 209.0), "N2O4(l)"),
    N2_O5_s(new Molecule(-42.0, 134.0, 178.0), "N2O5(s)"),
    N2_H4_l(new Molecule(51.0, 149.0, 121.0), "N2H4(l)"),
    N2_H3_C_H3_l(new Molecule(54.0, 180.0, 166.0), "N2H3CH3(l)"),
    H_N_O3_aq(new Molecule(-207.0, -111.0, 146.0), "HNO3(aq)"),
    H_N_O3_l(new Molecule(-174.0, -81.0, 156.0), "HNO3(l)"),
    N_H4_Cl_O4_s(new Molecule(-295.0, -89.0, 186.0), "NH4ClO4(s)"),
    N_H4_Cl_s(new Molecule(-314.0, -203.0, 96.0), "NH4Cl(s)"),

    //Oxygen
    O2_g(new Molecule(0.0, 0.0, 205.0), "O2(g)"),
    O_g(new Molecule(249.0, 232.0, 161.0), "O(g)"),
    O3_g(new Molecule(143.0, 163.0, 239.0), "O3(g)"),

    //Phosphorus
    P_s_white(new Molecule(0.0, 0.0, 41.0), "P(s) (white)"),
    P_s_red(new Molecule(-18.0, -12.0, 23.0), "P(s) (red)"),
    P_s_black(new Molecule(-39.0, -33.0, 23.0), "P(s) (black)"),
    P4_g(new Molecule(59.0, 24.0, 280.0), "P4(g)"),
    P_F5_g(new Molecule(-1578.0, -1509.0, 296.0), "PF5(g)"),
    P_H3_g(new Molecule(5.0, 13.0, 210.0), "PH3(g)"),
    H3_P_O4_s(new Molecule(-1279.0, -1119.0, 110.0), "H3PO4(s)"),
    H3_P_O4_l(new Molecule(-1267.0, 404.0, 404.0), "H3PO4(l)"),
    H3_P_O4_aq(new Molecule(-1288.0, -1143.0, 158.0), "H3PO4(aq)"),
    P4_O10_s(new Molecule(-2984.0, -2698.0, 229.0), "P4O10(s)"),

    //Potassium
    K_s(new Molecule(0.0, 0.0, 64.0), "K(s)"),
    K_Cl_s(new Molecule(-436.0, -408.0, 83.0), "KCl(s)"),
    K_Cl_O3_s(new Molecule(-391.0, -290.0, 143.0), "KClO3(s)"),
    K_Cl_O4_s(new Molecule(-433.0, -304.0, 151.0), "KClO4(s)"),
    K2_O_s(new Molecule(-361.0, -322.0, 98.0), "K2O(s)"),
    K2_O2_s(new Molecule(-496.0, -430.0, 113.0), "K2O2(s)"),
    K_O2_s(new Molecule(-283.0, -238.0, 117.0), "KO2(s)"),
    K_O_H_s(new Molecule(-425.0, -379.0, 79.0), "KOH(s)"),
    K_O_H_aq(new Molecule(-481.0, -440.0, 9.2), "KOH(aq)"),
    
    //Silicon
    Si_O2_s_quartz(new Molecule(-911.0, -856.0, 42.0), "SiO2(s) (quartz)"),
    Si_Cl4_l(new Molecule(-687.0, -620.0, 240.0), "SiCl4(l)"),

    //Silver
    Ag_s(new Molecule(0.0, 0.0, 43.0), "Ag(s)"),
    Ag_1_plus_aq(new Molecule(105.0, 77.0, 73.0), "Ag+(aq)"),
    Ag_Br_s(new Molecule(-100.0, -97.0, 107.0), "AgBr(s)"),
    Ag_C_N_s(new Molecule(146.0, 164.0, 84.0), "AgCN(s)"),
    Ag_Cl_s(new Molecule(-127.0, -110.0, 96.0), "AgCl(s)"),
    Ag2_Cr_O4_s(new Molecule(-712.0, -622.0, 217.0), "Ag2CrO4(s)"),
    Ag_I_s(new Molecule(-62.0, -66.0, 115.0), "AgI(s)"),
    Ag2_O_s(new Molecule(-31.0, -11.0, 122.0), "Ag2O(s)"),
    Ag2_S_s(new Molecule(-32.0, -40.0, 146.0), "Ag2S(s)"),

    //Sodium
    Na_s(new Molecule(0.0, 0.0, 51.0), "Na(s)"),
    Na_1_plus_aq(new Molecule(-240.0, -262.0, 59.0), "Na+(aq)"),
    Na_Br_s(new Molecule(-360.0, -347.0, 84.0), "NaBr(s)"),
    Na2_C_O3_s(new Molecule(-1131.0, -1048.0, 136.0), "Na2CO3(s)"),
    Na_H_C_O3_s(new Molecule(-948.0, -852.0, 102.0), "NaHCO3(s)"),
    Na_Cl_s(new Molecule(-411.0, -384.0, 72.0), "NaCl(s)"),
    Na_H_s(new Molecule(-56.0, -33.0, 40.0), "NaH(s)"),
    Na_I_s(new Molecule(-288.0, -282.0, 91.0), "NaI(s)"),
    Na_N_O2_s(new Molecule(-359.0, 404.0, 404.0), "NaNO2(s)"),
    Na_N_O3_s(new Molecule(-467.0, -366.0, 116.0), "NaNO3(s)"),
    Na2_O_s(new Molecule(-416.0, -377.0, 73.0), "Na2O(s)"),
    Na2_O2_s(new Molecule(-515.0, -451.0, 95.0), "Na2O2(s)"),
    Na_O_H_s(new Molecule(-427.0, -381.0, 64.0), "NaOH(s)"),
    Na_O_H_aq(new Molecule(-470.0, -419.0, 50.0), "NaOH(aq)"),

    //Sulfur
    S_s_rhombic(new Molecule(0.0, 0.0, 32.0), "S(s) (rhombic)"),
    S_s_monoclinic(new Molecule(0.3, 0.1, 33.0), "S(s) (monoclinic)"),
    S_2_minus_aq(new Molecule(33.0, 86.0, 215.0), "(S)2-(aq)"),
    S8_g(new Molecule(102.0, 50.0, 431.0), "S8(g)"),
    S_F6_g(new Molecule(-1209.0, -1105.0, 292.0), "SF6(g)"),
    H2_S_g(new Molecule(-21.0, -34.0, 206.0), "H2S(g)"),
    S_O2_g(new Molecule(-297.0, -300.0, 248.0), "SO2(g)"),
    S_O3_g(new Molecule(-396.0, -371.0, 257.0), "SO3(g)"),
    S_O4_2_minus_aq(new Molecule(-909.0, -745.0, 20.0), "(SO4)2-(aq)"),
    H2_S_O4_l(new Molecule(-814.0, -690.0, 157.0), "H2SO4(l)"),
    H2_S_O4_aq(new Molecule(-909.0, -745.0, 20.0), "H2SO4(aq)"),

    //Tin
    Sn_s_white(new Molecule(0.0, 0.0, 52.0), "Sn(s) (white)"),
    Sn_s_gray(new Molecule(22.0, 0.1, 44.0), "Sn(s) (gray)"),
    Sn_O_s(new Molecule(-285.0, -257.0, 56.0), "SnO(s)"),
    Sn_O2_s(new Molecule(-581.0, -520.0, 52.0), "SnO2(s)"),
    Sn_OH_2_s(new Molecule(-561.0, -492.0, 155.0), "Sn(OH)2(s)"),

    //Titanium
    Ti_Cl4_g(new Molecule(-763.0, -727.0, 355.0), "TiCl4(g)"),
    Ti_O2_s(new Molecule(-945.0, -890.0, 50.0), "TiO2(s)"),

    //Uranium
    U_s(new Molecule(0.0, 0.0, 50.0), "U(s)"),
    U_F6_s(new Molecule(-2137.0, -2008.0, 228.0), "UF6(s)"),
    U_F6_g(new Molecule(-2113.0, -2029.0, 380.0), "UF6(g)"),
    U_O2_s(new Molecule(-1084.0, 1029.0, 78.0), "UO2(s)"),
    U3_O8_s(new Molecule(-3575.0, -3393.0, 282.0), "U3O8(s)"),
    U_O3_s(new Molecule(-1230.0, -1150.0, 99.0), "UO3(s)"),

    //Xenon
    Xe_g(new Molecule(0.0, 0.0, 170.0), "Xe(g)"),
    Xe_F2_g(new Molecule(-108.0, -48.0, 254.0), "XeF2(g)"),
    Xe_F4_s(new Molecule(-251.0, -121.0, 146.0), "XeF4(s)"),
    Xe_F6_g(new Molecule(-294.0, 404.0, 404.0), "XeF6(g)"),
    Xe_O3_s(new Molecule(402.0, 404.0, 404.0), "XeO3(s)"),

    //Zinc
    Zn_s(new Molecule(0.0, 0.0, 42.0), "Zn(s)"),
    Zn_O_s(new Molecule(-348.0, -318.0, 44.0), "ZnO(s)"),
    Zn_OH_2_s(new Molecule(-642.0, 404.0, 404.0), "Zn(OH)2(s)"),
    Zn_S_s_wurtzite(new Molecule(-193.0, 404.0, 404.0), "ZnS(s) (wurtzite)"),
    Zn_S_s_zinc_blende(new Molecule(-206.0, -201.0, 58.0), "ZnS(s) (zinc blende)"),
    Zn_S_O4_s(new Molecule(-983.0, -874.0, 120.0), "ZnSO4(s)");




    private final Molecule molecule;
    private final String name;
    
    Molecules(Molecule molecule, String name){
        this.molecule = molecule;
        this.name = name;
    }

    Molecule getMolecule() {
        return molecule;
    }

    String getName() {
        return name;
    }


}