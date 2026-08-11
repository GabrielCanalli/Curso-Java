/**
 * ------------------------------------------------------------------------
 * 🏫 Bootcamp 01 - Manipulação de Datas
 * ------------------------------------------------------------------------
 * 📌 Resumo da Aula:
 * - Introdução ao trabalho com datas em Java utilizando a classe `Date`.
 * - Utilização da classe `SimpleDateFormat` e `DateFormat` para
 *   formatar a exibição de datas e horários em padrões personalizados.
 * - Comparação entre a exibição padrão da classe `Date` (formato cru/gmt)
 *   e a saída customizada (ex: `dd/MM/yyyy - HH:mm:ss`).
 * - Aplicação prática exibindo o carimbo de data e hora atual do sistema
 *   formatado de maneira legível.
 * ------------------------------------------------------------------------
 * 🇺🇸 Bootcamp 01 - Date Manipulation
 * ------------------------------------------------------------------------
 * 📌 Class Summary:
 * - Introduction to working with dates in Java using the `Date` class.
 * - Use of `SimpleDateFormat` and `DateFormat` classes to format date
 *   and time displays into custom patterns.
 * - Comparison between the default `Date` class output (raw format)
 *   and the customized output (e.g., `dd/MM/yyyy - HH:mm:ss`).
 * - Practical application displaying the current system timestamp
 *   formatted in a human-readable way.
 * ------------------------------------------------------------------------
 * Autor / Author: Gabriel Canalli
 * ------------------------------------------------------------------------
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bootcamp_01 {


        public static void main(String[] args) {
            var date = new Date();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
            System.out.println(date);
            System.out.println(formatter.format(date));
        }
    }
