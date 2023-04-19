public class cell {
    static String[] names = { cellMembrane, cytoplasm, nucleus};

    static String[] cellStructures = { "metabolism", "reproduction", "communication", "movement", "defense" };

    static int[] numberOfCellularStructures = {
        {1,2,3}
    };
}

static class cellMembrane{
    public String name = "cellMembrane";
    public String function1 = "protect";
    public String function2 = "carrier";
    public int quantity = 0;

    public cellMembrane(String cmName, int cmQuantity){
        name = cmName;
        quantity = cmQuantity;

        protect();
    }

    public void protect(){
        if(cellMembrane.getAttacked()){
            String mechanismsOfDefense = cellMembrane.add();

            for(int i=0; i<mechanismsOfDefense.length(); i++){
                cellMembrane.add();
            }
        }
    }
}

static class cytoplasm{
    public String name = "cytoplasm";
    public String function1 = "control";
    public String function2 = "genetic";
    public int quantity = 0;

    public cytoplasm(String cName, int cQuantity){
        name = cName;
        quantity = cQuantity;

        control();
    }

    public void control(){
        if(cytoplasm.getDivision()){
            String controlDistribution = cytoplasm.move();

            for(int i=0; i<controlDistribution.length(); i++){
                cytoplasm.move();
            }
        }
    }
}

static class nucleus{
    public String name = "nucleus";
    public String function1 = "platform";
    public String function2 = "chemicalReaction";
    public int quantity = 0;

    public nucleus(String nName, int nQuantity){
        name = nName;
        quantity = nQuantity;

        platformForTheRegulationOfGeneExpression();
    }

    public void platformForTheRegulationOfGeneExpression(){
        if(nucleus.getRegulate()){
            String nucleusRegulate = nucleus.syntheticConversion();

            for(int i=0; i<nucleusRegulate.length(); i++){
                nucleus.syntheticConversion();
            }
        }
    }
}


   