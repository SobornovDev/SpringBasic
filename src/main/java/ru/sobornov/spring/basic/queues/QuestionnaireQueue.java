package ru.sobornov.spring.basic.queues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.sobornov.spring.basic.questionnairies.Questionnaire;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sobornov Vladimir
 * @since : 06.10.2022
 **/
@Component
public class QuestionnaireQueue {
    private Questionnaire questionnaire;
    private List<Questionnaire> mqMock = new ArrayList<>();

    @Autowired
    public QuestionnaireQueue(@Qualifier("primaryQuestionnaire")  Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public void createMessage() {
        mqMock.add(questionnaire);
        System.out.println("Added questionnaire to queue. ID: " + questionnaire.getId() + "\n"
                + "Type: " + questionnaire.getType());
    }
}
