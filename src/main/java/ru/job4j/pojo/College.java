package ru.job4j.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2022, Calendar.FEBRUARY, 22);
        Student st = new Student();
        st.setFio("Иванов Иван Иванович");
        st.setGroup("Экономика");
        st.setDataEntry(calendar);

        DateFormat df = new SimpleDateFormat("dd MMM yyyy");
        System.out.println("ФИО - " + st.getFio() + System.lineSeparator()
                + "Группа - " + st.getGroup() + System.lineSeparator()
                + "Зачислен - " + df.format(st.getDataEntry().getTime()));
    }
}
