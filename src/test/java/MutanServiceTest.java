import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MutanServiceTest {

    private MutanService mutanService = new MutanService();

    @BeforeAll
    static void testPassed(){
        System.out.println("Test Passed");
    }

    @Test
    void testIsValid(){

        String[] test_case_valid = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
        String[] test_case_invalid = {"ATGCGA","GC","TTGT","AGAAGG","CCCCTA","CACTG"};

        assertEquals(mutanService.isValidDna(test_case_valid), true);
        assertEquals(mutanService.isValidDna(test_case_invalid), false);
    }

    @Test
    void testBuildMatrix(){

        String[] testCase1 =  {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};

        char[][] desiredResult = new char [6][];

        desiredResult[0] = testCase1[0].toCharArray();
        desiredResult[1] = testCase1[1].toCharArray();
        desiredResult[2] = testCase1[2].toCharArray();
        desiredResult[3] = testCase1[3].toCharArray();
        desiredResult[4] = testCase1[4].toCharArray();
        desiredResult[5] = testCase1[5].toCharArray();


        char[][] result = mutanService.buildMatrix(testCase1);

        for(int i=0; i< result.length; i++){
            for(int j=0; j < result[0].length; j++){
                assertEquals(result[i][j], desiredResult[i][j]);
            }
        }
    }
}
