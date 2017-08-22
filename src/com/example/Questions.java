package com.example;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.*;

public class Questions {

    public static final String BAZA = "D:\\Anesteisha\\Qestions\\база.txt";

    public static final String VOPROS = "D:\\Anesteisha\\Qestions\\вопросы.txt";
    public static final String PRAVILNYJ = "D:\\Anesteisha\\Qestions\\вариант правильный.txt";
    public static final String VTOROJ = "D:\\Anesteisha\\Qestions\\вариант два.txt";
    public static final String TRETIJ = "D:\\Anesteisha\\Qestions\\вариант три.txt";
    public static final String CHETVERTYJ= "D:\\Anesteisha\\Qestions\\вариант четыре.txt";
    public static final String VOPROS_OTVET= "D:\\Anesteisha\\Qestions\\вопрос_ответ.txt";


    public static void main(String[] args) throws Exception {
        FileWriter writer1 = new FileWriter(VOPROS, true); // true - дозапись (false - перезапись)
        FileWriter writer2 = new FileWriter(PRAVILNYJ, true);
        FileWriter writer3 = new FileWriter(VTOROJ, true);
        FileWriter writer4 = new FileWriter(TRETIJ, true);
        FileWriter writer5 = new FileWriter(CHETVERTYJ, true);
        FileWriter writer6 = new FileWriter(VOPROS_OTVET, true);

        FileReader reader = new FileReader(BAZA);
        Scanner scan = new Scanner(reader);

        String vopros =null;
        String pravilnyj =null;
        String vtoroj =null;
        String tretij =null;
        String chetvertyj =null;
        String vopros_otvet =null;


        try {

int n = 0;
            do {
                vopros = scan.nextLine();

                pravilnyj = scan.nextLine();
                vtoroj = scan.nextLine();
                tretij = scan.nextLine();
                chetvertyj = scan.nextLine();
                vopros_otvet = vopros+" Правильный ответ: " + pravilnyj;

                writeNewLineInFile(vopros, writer1);
                writeNewLineInFile(pravilnyj, writer2);
                writeNewLineInFile(vtoroj, writer3);
                writeNewLineInFile(tretij, writer4);
                writeNewLineInFile(chetvertyj, writer5);
                writeNewLineInFile(vopros_otvet, writer6);
                n++;
                System.out.println(n+chetvertyj);
            } while (scan.hasNextLine());


        }

        catch (IndexOutOfBoundsException e){
            System.out.println("Error IndexOutOfBoundsException");
        }

        catch (IOException e){
            System.out.println("Error IOException");
        }

        finally {
            writer1.close();
            writer2.close();
            writer3.close();
            writer4.close();
            writer5.close();
            writer6.close();

            scan.close();
        }

    }





    //создаёт новый список
    public static void writeNewLineInFile(String line, FileWriter writer) throws Exception{

        writer.write(line);
        writer.append('\n');
        writer.flush();

    }


}
