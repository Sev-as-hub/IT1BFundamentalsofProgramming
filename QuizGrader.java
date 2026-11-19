import java.util.Arrays;
// Kinukuha ang kagamitan para sa pag-aayos at pagbabasa ng mga hanay o listahan

public class QuizGrader {
// Ipinapahayag ang pangunahing lalagyan ng programa na tinatawag na QuizGrader

    public static void main(String[] args){
        // Dito nagsisimula ang pagtakbo ng buong programa

        char [] answerkey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        //Gumagawa ng listahan ng mga tamang sagot gamit ang isahang titik

        char [] studentanswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};
        // Gumagawa ng listahan ng mga sagot ng mag-aaral

        int correctcount = 0;
        // Nagtatakda ng panimulang bilang na sero para sa mga tamang sagot

        for(int i = 0; i < answerkey.length; i++){
            // Inuulit ang pagsusuri mula sa unang tanong hanggang sa pinakahuli

            if(studentanswers[i] == answerkey[i]){
                // Sinusuri kung magkapareho ang sagot ng mag-aaral at ang tamang sagot sa kasalukuyang bilang

                correctcount++;
                // Dinadagdagan ng isa ang bilang ng tamang sagot kung tama ang napili

            }else{
                // Ginagawa ito kung mali ang sagot ng mag-aaral

                System.out.println("Question " + (i + 1) + ": Incorrect. You answered " + studentanswers[i] +
                        "correct answer is " + answerkey[i]);
                // Ipinapakita ang bilang ng tanong at ang maling sagot ng mag-aaral
            }
        }

        double scorePercentage = ((double) correctcount / answerkey.length) * 100;
        // Kinakalkula ang porsyento ng marka sa pamamagitan ng paghahati ng tamang sagot sa kabuuang bilang at pagpaparami sa isandaan

        System.out.println("Correct Answers: " + correctcount + "/" + answerkey.length);
        // Ipinapakita ang kabuuang bilang ng nakuhang tamang sagot laban sa kabuuang tanong

        System.out.println("Score Percentage: " + scorePercentage + "%");
        // Ipinapakita ang nakuhang porsyento ng marka

        if(scorePercentage >= 70){
            // Sinusuri kung umabot sa pitumpung porsyento o higit pa ang nakuha

            System.out.println("Result: PASSED");
            // Ipinapakita na pasado ang mag-aaral

        }else{
            System.out.println("Result: FAILED");
            // Ipinapakita na bagsak ang mag-aaral

        } // Isinasara ang pagsusuri kung pasado o bagsak
    }// Isinasara ang pangunahing bahagi ng pagtakbo ng programa
} // Isinasara ang kabuuan ng QuizGrader