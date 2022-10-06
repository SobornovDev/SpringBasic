package ru.sobornov.spring.basic.questionnairies;

import java.util.UUID;

/**
 * @author : Sobornov Vladimir
 * @since : 06.10.2022
 **/
public interface Questionnaire {
    void send(Questionnaire questionnaire);
    UUID getId();

    String getType();
}
