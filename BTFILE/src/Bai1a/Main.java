package Bai1a;

import java.io.*;

//BÀI 1’: hãy ghi file các chuỗi sau: “hạnh” , “phúc”, “vô “, “thường”, “bất”, “diệt”.
//        Sau đó dọc file ra màn hình consolde

// Nguyễn Khắc Tài - CT030147
public class Main {
    public static void main(String[] args) {
        String filename = "bai1.txt";
        try {
            writeFile(filename);
            readFile(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String filename) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("hạnh");
        bufferedWriter.newLine();
        bufferedWriter.write("phúc");
        bufferedWriter.newLine();
        bufferedWriter.write("vô");
        bufferedWriter.newLine();
        bufferedWriter.write("thường");
        bufferedWriter.newLine();
        bufferedWriter.write("bất");
        bufferedWriter.newLine();
        bufferedWriter.write("diệt");
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
    }

    public static void readFile(String filename) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(filename);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
    }
}
