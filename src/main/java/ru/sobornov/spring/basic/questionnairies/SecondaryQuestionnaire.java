package ru.sobornov.spring.basic.questionnairies;

import java.time.LocalDate;
import java.util.UUID;

/**
 * @author : Sobornov Vladimir
 * @since : 06.10.2022
 **/
public class SecondaryQuestionnaire implements Questionnaire{
    private final UUID id = UUID.randomUUID();
    private final String type = "Secondary";
    private String passportType;
    private String passportIssueDate;

    private SecondaryQuestionnaire(String passportType, String passportIssueDate) {
        this.passportType = passportType;
        this.passportIssueDate = passportIssueDate;
    }

    private static SecondaryQuestionnaire createSecondaryQuestionnaire(String passportType, String passportIssueDate) {
        return new SecondaryQuestionnaire(passportType, passportIssueDate);
    }

    @Override
    public void send(Questionnaire questionnaire) {
        System.out.println("secondary questionnaire send");
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }
}
