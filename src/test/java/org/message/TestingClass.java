package org.message;

import org.example.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestingClass {


    MailServer mailsrv = new MailServer();

    Client client = new Client("test", "test");

    TemplateEngine templateEngine = new TemplateEngine("");
    @Mock
    Template template = mock(Template.class);


    @Test
    public void testMessenger() {
        Messenger messenger = new Messenger(mailsrv, templateEngine);
        messenger.sendMessage(client, template);

    }


    @Test
    public void mailServer() {
        assertTrue(mailsrv.send(client.getEmail(), "test"));

    }

    @Test
    public void prepareMessage() {
        String msgContent = templateEngine.prepareMessage(template, client);
        assertTrue(msgContent.equals(""));
    }

}
