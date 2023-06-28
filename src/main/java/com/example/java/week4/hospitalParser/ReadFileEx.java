package com.example.java.week4.hospitalParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));
        //File 을 읽어 전체 내용을 Buffer 에 저장

        String line;
            //Buffer 에 담겨있는 파일을 한줄씩 읽어 line 에 저장, 파일의 끝에 다다르면 null
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                lines.add(line);
            }
        return lines;
    }

    public Hospital parse(String str) {
        //String 을 매개변수로 받아 parse 진행
        String[] splitArr = str.split(",");
        Address address = new Address(splitArr[10], splitArr[5], splitArr[7]);

        return new Hospital(splitArr[1], splitArr[11], address);
    }

    public List<Hospital> getHospitals(List<String> lines) {
        //List<String>을 매개변수로 받아 for-each 문을 통해 요소 하나씩 parse 진행 후 List<Hospital>에 추가
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }
    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(StandardCharsets.UTF_8);
        List<String> lines = rfe.getLines("/Users/hjun/Desktop/hospital_info_10Line.csv");
        List<Hospital> parsedHospital = rfe.getHospitals(lines);
        for (Hospital hospital : parsedHospital) {
            System.out.printf("병원 이름: %s | WebSite: %s | 주소: %s\n"
                    , hospital.getName(), hospital.getWebSiteAddr(), hospital.getAddress().getFullAddr());
        }
    }
}

// /Users/hjun/Desktop/hospital_info_0920_utf8.csv
// (아래의 두 해결 방법은 파일 자체가 encoding 이 되어있지 않아도됨)

//        FileInputStream 을 이용해 file 을 읽으면서 encoding 문제 해결.
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/hjun/Desktop/hospital_info.csv"),"EUC-KR"));
//        System.out.println(br.readLine());

//        FileReader 와 Charset 을 이용해 file 을 읽으면서 encoding 문제 해결.
//        try (
//                BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("EUC-KR")))
//        ){
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//                lines.add(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        아래의 방법은 파일 자체가 UTF-8로 encoding 되어 있어야함
//        try (BufferedReader br = Files.newBufferedReader(
//                Paths.get(fileName), StandardCharsets.UTF_8)) {
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//                lines.add(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }