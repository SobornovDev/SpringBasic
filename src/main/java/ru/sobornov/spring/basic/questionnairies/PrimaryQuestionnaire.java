package ru.sobornov.spring.basic.questionnairies;

import java.util.UUID;

/**
 * @author : Sobornov Vladimir
 * @since : 06.10.2022
 **/
public class PrimaryQuestionnaire implements Questionnaire{
    private final UUID id = UUID.randomUUID();
    private String name;
    private String surname;
    private String isResident;

    private PrimaryQuestionnaire() {}

    public static PrimaryQuestionnaire createPrimaryQuestionnaire(String name, String surname, String isResident) {
        return new PrimaryQuestionnaire();
    }

    @Override
    public void send(Questionnaire questionnaire) {
        System.out.println("primary questionnaire send");

    }
}
