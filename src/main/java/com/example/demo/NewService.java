package com.example.demo;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import org.springframework.stereotype.Service;

@Service
public class NewService {

    public VCard generate(){
        String str =
                "BEGIN:VCARD\r\n" +
                        "VERSION:4.0\r\n" +
                        "N:Doe;Jonathan;;Mr;\r\n" +
                        "FN:John Doe\r\n" +
                        "END:VCARD\r\n";

        VCard vcard = Ezvcard.parse(str).first();
        String fullName = vcard.getFormattedName().getValue();
        String lastName = vcard.getStructuredName().getFamily();

        return vcard;
    }
}
