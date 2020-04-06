package com.soad.uapquestionbank;

import android.icu.text.StringSearch;

public class Questions {
    private String file_name;
    private String sem_format;
    public String dept;
    public int sem;

    public String getFile_name() {
        return file_name;
    }

    public String getSem_format() {
        return sem_format;
    }

    public Questions(String dept, int sem) {

        if(dept.equals("Architecture"))
        {
            this.file_name= "ARCH";
        }
        if(dept.equals("Computer Science and Engineering"))
        {
            this.file_name= "CSE";
        }
        if(dept.equals("Electrical and Electronics Engineering"))
        {
            this.file_name= "EEE";
        }

        if(dept.equals("Business Administration"))
        {
            this.file_name= "BBA";
        }
        if(dept.equals("Civil Enigineering"))
        {
            this.file_name= "CE";
        }
        if(dept.equals("English"))
        {
            this.file_name= "ENG";
        }
        if(dept.equals("Pharmacy"))
        {
            this.file_name= "PHARM";
        }
        if(dept.equals("Law"))
        {
            this.file_name= "LAW";
        }
        if(sem==1)
        {
            this.sem_format="1-1";
        }
        if(sem==2)
        {
            this.sem_format="1_2";
        }
        if(sem==3)
        {
            this.sem_format="2_1";
        }
        if(sem==4)
        {
            this.sem_format="2_2";
        }
        if(sem==5)
        {
            this.sem_format="3_1";
        }
        if(sem==6)
        {
            this.sem_format="3_2";
        }
        if(sem==7)
        {
            this.sem_format="4_1";
        }
        if(sem==8)
        {
            this.sem_format="4_2";
        }

        this.dept = dept;
        this.sem = sem;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSem() {
        return sem;
    }

    public static String[] semVw= new String[]{"","First", "Second","Third","Fourth","Fifth","Seventh","Eighth"};

    public void setSem(int sem) {
        this.sem = sem;
    }
}
