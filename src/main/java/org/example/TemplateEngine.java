package org.example;

public class TemplateEngine implements Template {
    String msgContent;
    String template;

    public TemplateEngine(String msgContent) {
        this.msgContent = msgContent;
    }

    @Override
    public String template() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String prepareMessage(Template template, Client client) {
            msgContent.equals("messageforclient" + template);
        return msgContent;
    }

    @Override
    public String toString() {
        return "TemplateEngine{" +
                "msgContent='" + msgContent + '\'' +
                ", template='" + template + '\'' +
                '}';
    }
}
