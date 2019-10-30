public class MutanService {

    public MutanService (){}

    public boolean isMutan(String[] dna){

        if(!isValidDna(dna)){
            System.out.println("Invalid format");
        }

        char[][] matrixMutan = buildMatrix(dna);

        int cantA, cantT, cantC, cantG;

        // chequeo vertical

        boolean checkVertical = false;

        cantA = 0;
        cantT = 0;
        cantC = 0;
        cantG = 0;
        

        return false;
    }

    public char[][] buildMatrix(String[] arrayDna){

        char[][] matrixBuilded = null;

        int rows, columns;

        try {
            rows = arrayDna.length;

            columns = arrayDna[0].length();

            matrixBuilded = new char[rows][columns];

            for(int i=0; i < rows; i++){

                String currentRow = arrayDna[i];

                for (int j=0; j < columns; j++){

                    matrixBuilded[i][j] = currentRow.charAt(j);

                }

            }

        } catch (Exception e){

            System.out.println("Error building matrix. Exception: " + e.getMessage());
        }

        return matrixBuilded;
    }

    public boolean isValidDna(String [] dna){

        boolean result = false;

        int size = dna.length;

        for (String st : dna) {
            result = (st.length() == size);
        }

        return result;
    }
}
