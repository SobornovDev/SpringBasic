package ru.sobornov.spring.basic.queues;

import ru.sobornov.spring.basic.questionnairies.Questionnaire;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sobornov Vladimir
 * @since : 06.10.2022
 **/
public class QuestionnaireQueue {
    private Questionnaire questionnaire;
    private List<Questionnaire> mqMock = new ArrayList<>();

    public QuestionnaireQueue(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public void createMessage() {
        mqMock.add(questionnaire);
        System.out.println("Added questionnaire to queue. ID: " + questionnaire.getId() + "\n"
                + "Type: " + questionnaire.getType());
    }
}
