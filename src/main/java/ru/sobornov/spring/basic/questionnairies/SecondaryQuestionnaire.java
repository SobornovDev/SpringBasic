package ru.sobornov.spring.basic.questionnairies;

import java.time.LocalDate;

/**
 * @author : Sobornov Vladimir
 * @since : 06.10.2022
 **/
public class SecondaryQuestionnaire implements Questionnaire{
    private int id;
    private String passportType;
    private LocalDate passportIssueDate;

    private SecondaryQuestionnaire() {}

    @Override
    public void send(Questionnaire questionnaire) {
        System.out.println("secondary questionnaire send");
    }
}
