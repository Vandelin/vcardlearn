package com.example.demo;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.io.text.VCardWriter;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class NewService {

    private FileOutputStream fout;
    public void generate(){
        String str =
                "BEGIN:VCARD\r\n" +
                        "VERSION:4.0\r\n" +
                        "N:Doe;Jonathan;;Mr;\r\n" +
                        "FN:John Doe\r\n" +
                        "END:VCARD\r\n";

        VCard vcard = Ezvcard.parse(str).first();
        String fullName = vcard.getFormattedName().getValue();
        String lastName = vcard.getStructuredName().getFamily();

        try {
            fout = new FileOutputStream("myCalendar.vcf");

            vcard.write(fout);
            fout.flush();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
