package ru.stqa.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    void canCreateContact() {
        var contact = new ContactData()
                .withFirstname(randomString(10))
                .withLastname(randomString(10))
                .withPhoto(randomFile("src/test/resources/images"));
        app.contacts().create(contact);
    }
}
