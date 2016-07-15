package com.test;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.*;

/**
 * Created by 205025 on 6/28/2016.
 */
public class ReadFileContents {
    private static String[] filedMappingName ={"UserName","age","MRNCODE","IncomingDate","OutGoingDate"};
    public static void main(String []args){
        FileReader reader= null;
        try {
             reader = new FileReader(("D:\\IdeaProjects\\CoreJavaPractise\\src\\main\\resources\\Input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(reader);
        try {
            String currentLine = br.readLine();
            List<GuestDetails> guestList = new ArrayList<>();
            while(currentLine!=null){
                String[] str = currentLine.split(";");

                if(validateString(str)) {
                    GuestDetails detail = new GuestDetails();

                    detail.setName(str[0]);
                    detail.setAge(Integer.valueOf(str[1]));
                    detail.setIncomingCode(str[2]);
                    detail.setIncomingDate(str[3]);
                    detail.setOutGoingDate(str[4]);
                    guestList.add(detail);
                    System.out.println(detail.toString());
                }
                currentLine = br.readLine();
            }

            Set<String> getDate = new TreeSet<>();
            for(GuestDetails guest: guestList)
            {
                getDate.add(guest.getIncomingDate());
            }
            Map<String, List<GuestDetails>> hm = new TreeMap<>();
            for(String dateString:getDate) {
                List<GuestDetails> guestDetailses = new ArrayList<>();
                for (GuestDetails guest : guestList) {
                    if (dateString.equalsIgnoreCase(guest.getIncomingDate())) {
                        guestDetailses.add(guest);
                    }
                }
                hm.put(dateString, guestDetailses);
            }

            Set<String> incodeString = new HashSet<>();
            for(GuestDetails details:guestList){
                incodeString.add(details.getIncomingCode());
            }
            int count=0;
            Map<String, Integer> hmCount = new TreeMap<>();
            for(String incode:incodeString) {
                count =0;
                for (GuestDetails guest : guestList) {
                    if (incode.equalsIgnoreCase(guest.getIncomingCode())) {
                        count ++;
                    }
                }
                hmCount.put(incode, count);
            }

            for(String incode:incodeString)
            {
                System.out.println(incode+ ":" + hmCount.get(incode));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static boolean validateString(String[] str) throws Exception{
        int i = 0;
       while(i < str.length)
       {
            if(str[i].isEmpty() || str[i] == null) {
                System.out.println("Mandatory Field   "+filedMappingName[i]+"  is missing");
                return false;
            }
           i++;
       }
        return true;
    }

    static class GuestDetails{
        private String name;
        private int age;
        private String incomingCode;
        private String incomingDate;
        private String outGoingDate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getIncomingCode() {
            return incomingCode;
        }

        public void setIncomingCode(String incomingCode) {
            this.incomingCode = incomingCode;
        }

        public String getIncomingDate() {
            return incomingDate;
        }

        public void setIncomingDate(String incomingDate) {
            this.incomingDate = incomingDate;
        }

        public String getOutGoingDate() {
            return outGoingDate;
        }

        public void setOutGoingDate(String outGoingDate) {
            this.outGoingDate = outGoingDate;
        }

        @Override
        public String toString() {
            return "GuestDetails{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", incomingCode='" + incomingCode + '\'' +
                    ", incomingDate='" + incomingDate + '\'' +
                    ", outGoingDate='" + outGoingDate + '\'' +
                    '}';
        }
    }
}
