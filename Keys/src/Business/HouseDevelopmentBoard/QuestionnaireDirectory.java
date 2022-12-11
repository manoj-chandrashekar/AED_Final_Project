/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HouseDevelopmentBoard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nagarjunmallesh
 */
public class QuestionnaireDirectory {
    
    List<Questionnaire> questionnaireDirectory = new ArrayList<Questionnaire>();

    public List<Questionnaire> getQuestionnaireDirectory() {
        return questionnaireDirectory;
    }

    public void setQuestionnaireDirectory(List<Questionnaire> questionnaireDirectory) {
        this.questionnaireDirectory = questionnaireDirectory;
    }
    
    public void addQuestionnaire(Questionnaire survey){
        questionnaireDirectory.add(survey);
    }
    
    public void removeQuestionnaire(Questionnaire survey){
        questionnaireDirectory.remove(survey);
    }
}
