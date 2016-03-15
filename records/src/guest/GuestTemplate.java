package guest;

import design.Template;

import java.util.ArrayList;
import java.util.List;

public class GuestTemplate {
    private final Template template;
    private final Guests guests;

    public GuestTemplate(Guests guests, Template template) {
        this.guests = guests;
        this.template = template;
    }

    public List<String> getGuestsWithTemplate() {
        List<String> allGuestTemplates = new ArrayList<>();
        for(int i=0;i<guests.getAllguests().size();i++)
            allGuestTemplates.add(template.generate(guests.getAllguests().get(i)));
        return allGuestTemplates;
    }

    public List<StringBuilder> getGuestsWithBorder() {
        List<StringBuilder> allGuestTemplates = new ArrayList<>();
        for(int i=0;i<guests.getAllguests().size();i++)
            allGuestTemplates.add(template.getWithBorder(guests.getAllguests().get(i)));
        return allGuestTemplates;
    }
}
